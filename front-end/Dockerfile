# build stage
FROM node:lts-alpine as build-stage
WORKDIR /app
COPY front-end/package*.json ./
RUN ls -al
RUN npm install
COPY /front-end .
RUN npm run build

# production stage
FROM nginx:stable-alpine as production-stage
COPY --from=build-stage /app/dist /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]

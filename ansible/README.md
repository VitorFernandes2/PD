# Ansible
## Description
- Maven
- Gradle
- MongoDB
- Docker
- Ansible

# Guide to run all the aplication
## Ansible Playbooks
### Setup Ansible playbook enviroment
##### Remove docker-compose versions that are not 1.29.2
- `sudo apt-get remove docker-compose`
- `sudo rm /usr/local/bin/docker-compose`
- `sudo apt remove docker-compose`
- `sudo apt autoremove`

##### Install docker-compose 1.29.2
- `sudo curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose`
- `sudo chmod +x /usr/local/bin/docker-compose`
- `sudo docker-compose --version` -> in case this command doesn't work, please manually check its existance by going to `/usr/local/bin/` folder and executing this command inside it.

### Using Ansible to start all services
- `ansible-playbook playbook.yml --ask-vault-pass -K`
- root user password
- ansible-vault password -> `secret`
- project main folder path (example: `/home/` == `/home/PD`)

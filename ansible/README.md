# Ansible
## Description
- Java 11
- Maven
- MongoDB
- Docker
- Ansible

# Guide to run all the aplication
## Ansible Playbooks
### Using Ansible to start all services
- `ansible-playbook mongo_playbook.yml --ask-vault-pass -i hosts/dev/groups.yml -i hosts/dev/hosts.yml -K`
- root user password
- ansible-vault password `secret`

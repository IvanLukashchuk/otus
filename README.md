1. Go to /containers/kubernetes
2. Run kubectl apply -f .
3. Wait 10 sec   
4. Run curl -H 'Host:arch.homework' http://{{minikubeIp}}/otusapp/ivan/health

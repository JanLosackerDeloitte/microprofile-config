FROM payara/micro
COPY ./target/config-example.war ${DEPLOY_DIR}

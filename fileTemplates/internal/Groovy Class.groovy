#if (${PACKAGE_NAME} && $PACKAGE_NAME != "" )package ${PACKAGE_NAME}
#end

import groovy.transform.CompileStatic

#parse("File Header.java")
@CompileStatic
class ${NAME} {
}

package org.nuxeo.ecm.platform.publisher.jbpm.test;

import org.nuxeo.ecm.platform.publisher.jbpm.CoreProxyWithWorkflowFactory;

public class TestCorePublicationWithWorkflowWithACL extends TestCorePublicationWithWorkflow {

    {
        factoryParams.put(CoreProxyWithWorkflowFactory.LOOKUP_STATE_PARAM_KEY, CoreProxyWithWorkflowFactory.LOOKUP_STATE_PARAM_BYACL);
    }
}
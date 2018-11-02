/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.model.v20151111;


import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.GroupDescription;
import com.aliyuncs.batchcompute.transform.v20151111.ChangeClusterDesiredVMCountRequestMarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class ChangeClusterDesiredVMCountRequest extends BatchComputeRequest<ChangeClusterDesiredVMCountResponse> {

    public ChangeClusterDesiredVMCountRequest() {
        super("BatchCompute", "2015-11-11", "ModifyCluster");
        setUriPattern("/clusters/[ResourceName]");
        setMethod(MethodType.PUT);

    }

    private String resourceName;

    ClusterDescription clusterDesc = new ClusterDescription();


    private int priority;

    public boolean _useInteger = true;

    public String getClusterId() {
        return this.resourceName;
    }

    public void setClusterId(String clusterId) {
        this.resourceName = clusterId;
        putPathParameter("ResourceName", resourceName);
    }

    public void setClusterDescription(ClusterDescription d){
        clusterDesc  = d;

//        for(Map.Entry<String, GroupDescription> set: clusterDesc.getGroups().entrySet()){
//            set.getValue().setResourceType(null);
//        }

        ChangeClusterDesiredVMCountRequestMarshaller.marshall(this);
    }
    public void setDesiredVmCount(String groupName, int count) throws ClientException {

        GroupDescription groupDesc = new GroupDescription();
        groupDesc.setDesiredVMCount(count);
        //groupDesc.setResourceType(null);
        clusterDesc.addGroup(groupName, groupDesc);

        ChangeClusterDesiredVMCountRequestMarshaller.marshall(this);
    }

    public ClusterDescription getClusterDescription() {
        return clusterDesc;
    }

    @Override
    public Class< ChangeClusterDesiredVMCountResponse> getResponseClass() {
        return  ChangeClusterDesiredVMCountResponse.class;
    }

}

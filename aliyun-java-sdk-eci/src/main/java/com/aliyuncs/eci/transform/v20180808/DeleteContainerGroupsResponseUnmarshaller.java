/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.eci.transform.v20180808;

import com.aliyuncs.eci.model.v20180808.DeleteContainerGroupsResponse;
import com.aliyuncs.eci.model.v20180808.DeleteContainerGroupsResponse.InstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaohui
 * @version 1.3.9
 */
public class DeleteContainerGroupsResponseUnmarshaller {
    public static DeleteContainerGroupsResponse unmarshall(DeleteContainerGroupsResponse deleteContainerGroupsResponse, UnmarshallerContext context) {

        deleteContainerGroupsResponse.setRequestId(context.stringValue("DeleteContainerGroupsResponse.RequestId"));

        List<InstanceResponse> instanceResponses = new ArrayList<InstanceResponse>();
        for(int i = 0; i < context.lengthValue("DeleteContainerGroupsResponse.InstanceResponseSet.Length"); i++){
            InstanceResponse instanceResponse = new InstanceResponse();
            instanceResponse.setContainerGroupId(context.stringValue("DeleteContainerGroupsResponse.InstanceResponseSet[" + i + "].ContainerGroupId"));
            instanceResponse.setMessage(context.stringValue("DeleteContainerGroupsResponse.InstanceResponseSet[" + i + "].Message"));
            instanceResponse.setCode(context.stringValue("DeleteContainerGroupsResponse.InstanceResponseSet[" + i + "].Code"));
            instanceResponses.add(instanceResponse);
        }
        deleteContainerGroupsResponse.setInstanceResponseSet(instanceResponses);

        return deleteContainerGroupsResponse;
    }

}

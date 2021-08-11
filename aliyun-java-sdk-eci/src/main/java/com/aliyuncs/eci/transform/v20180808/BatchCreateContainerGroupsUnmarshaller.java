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

import com.aliyuncs.eci.model.v20180808.BatchCreateContainerGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaohui
 * @version 1.2.7
 */
public class BatchCreateContainerGroupsUnmarshaller {

    public static BatchCreateContainerGroupsResponse unmarshall(BatchCreateContainerGroupsResponse batchCreateContainerGroupsResponse, UnmarshallerContext context) {

        batchCreateContainerGroupsResponse.setRequestId(context.stringValue("BatchCreateContainerGroupsResponse.RequestId"));

        List<String> containerGroupIds = new ArrayList<String>();
        for (int i = 0; i < context.lengthValue("BatchCreateContainerGroupsResponse.ContainerGroupIds.Length"); i++) {
            containerGroupIds.add(context.stringValue("BatchCreateContainerGroupsResponse.ContainerGroupIds[" + i + "]"));
        }
        batchCreateContainerGroupsResponse.setContainerGroupIds(containerGroupIds);

        return batchCreateContainerGroupsResponse;
    }
}

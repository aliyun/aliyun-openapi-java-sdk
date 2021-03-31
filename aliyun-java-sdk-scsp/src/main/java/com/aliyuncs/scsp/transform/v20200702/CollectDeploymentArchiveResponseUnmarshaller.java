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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.CollectDeploymentArchiveResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CollectDeploymentArchiveResponseUnmarshaller {

	public static CollectDeploymentArchiveResponse unmarshall(CollectDeploymentArchiveResponse collectDeploymentArchiveResponse, UnmarshallerContext _ctx) {
		
		collectDeploymentArchiveResponse.setRequestId(_ctx.stringValue("CollectDeploymentArchiveResponse.RequestId"));
		collectDeploymentArchiveResponse.setMessage(_ctx.stringValue("CollectDeploymentArchiveResponse.Message"));
		collectDeploymentArchiveResponse.setHttpStatusCode(_ctx.integerValue("CollectDeploymentArchiveResponse.HttpStatusCode"));
		collectDeploymentArchiveResponse.setData(_ctx.stringValue("CollectDeploymentArchiveResponse.Data"));
		collectDeploymentArchiveResponse.setCode(_ctx.stringValue("CollectDeploymentArchiveResponse.Code"));
		collectDeploymentArchiveResponse.setSuccess(_ctx.booleanValue("CollectDeploymentArchiveResponse.Success"));
	 
	 	return collectDeploymentArchiveResponse;
	}
}
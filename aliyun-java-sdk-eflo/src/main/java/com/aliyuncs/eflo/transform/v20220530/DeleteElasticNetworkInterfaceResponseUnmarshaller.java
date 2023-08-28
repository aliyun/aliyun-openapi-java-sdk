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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.DeleteElasticNetworkInterfaceResponse;
import com.aliyuncs.eflo.model.v20220530.DeleteElasticNetworkInterfaceResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteElasticNetworkInterfaceResponseUnmarshaller {

	public static DeleteElasticNetworkInterfaceResponse unmarshall(DeleteElasticNetworkInterfaceResponse deleteElasticNetworkInterfaceResponse, UnmarshallerContext _ctx) {
		
		deleteElasticNetworkInterfaceResponse.setRequestId(_ctx.stringValue("DeleteElasticNetworkInterfaceResponse.RequestId"));
		deleteElasticNetworkInterfaceResponse.setCode(_ctx.integerValue("DeleteElasticNetworkInterfaceResponse.Code"));
		deleteElasticNetworkInterfaceResponse.setMessage(_ctx.stringValue("DeleteElasticNetworkInterfaceResponse.Message"));

		Content content = new Content();
		content.setNodeId(_ctx.stringValue("DeleteElasticNetworkInterfaceResponse.Content.NodeId"));
		content.setElasticNetworkInterfaceId(_ctx.stringValue("DeleteElasticNetworkInterfaceResponse.Content.ElasticNetworkInterfaceId"));
		deleteElasticNetworkInterfaceResponse.setContent(content);
	 
	 	return deleteElasticNetworkInterfaceResponse;
	}
}
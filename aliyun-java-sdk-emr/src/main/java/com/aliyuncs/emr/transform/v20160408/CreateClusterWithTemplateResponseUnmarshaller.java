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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.CreateClusterWithTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateClusterWithTemplateResponseUnmarshaller {

	public static CreateClusterWithTemplateResponse unmarshall(CreateClusterWithTemplateResponse createClusterWithTemplateResponse, UnmarshallerContext context) {
		
		createClusterWithTemplateResponse.setRequestId(context.stringValue("CreateClusterWithTemplateResponse.RequestId"));
		createClusterWithTemplateResponse.setClusterBizId(context.stringValue("CreateClusterWithTemplateResponse.clusterBizId"));
		createClusterWithTemplateResponse.setClusterId(context.longValue("CreateClusterWithTemplateResponse.ClusterId"));
		createClusterWithTemplateResponse.setWorkFlowId(context.longValue("CreateClusterWithTemplateResponse.WorkFlowId"));
		createClusterWithTemplateResponse.setEmrOrderId(context.stringValue("CreateClusterWithTemplateResponse.EmrOrderId"));
		createClusterWithTemplateResponse.setMasterOrderId(context.stringValue("CreateClusterWithTemplateResponse.MasterOrderId"));
		createClusterWithTemplateResponse.setCoreOrderId(context.stringValue("CreateClusterWithTemplateResponse.CoreOrderId"));
		createClusterWithTemplateResponse.setWorkFlowInstanceId(context.stringValue("CreateClusterWithTemplateResponse.WorkFlowInstanceId"));
	 
	 	return createClusterWithTemplateResponse;
	}
}
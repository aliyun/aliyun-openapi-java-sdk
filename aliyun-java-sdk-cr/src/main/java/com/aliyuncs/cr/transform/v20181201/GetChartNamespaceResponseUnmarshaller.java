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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetChartNamespaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChartNamespaceResponseUnmarshaller {

	public static GetChartNamespaceResponse unmarshall(GetChartNamespaceResponse getChartNamespaceResponse, UnmarshallerContext _ctx) {
		
		getChartNamespaceResponse.setRequestId(_ctx.stringValue("GetChartNamespaceResponse.RequestId"));
		getChartNamespaceResponse.setIsSuccess(_ctx.booleanValue("GetChartNamespaceResponse.IsSuccess"));
		getChartNamespaceResponse.setCode(_ctx.stringValue("GetChartNamespaceResponse.Code"));
		getChartNamespaceResponse.setNamespaceName(_ctx.stringValue("GetChartNamespaceResponse.NamespaceName"));
		getChartNamespaceResponse.setNamespaceStatus(_ctx.stringValue("GetChartNamespaceResponse.NamespaceStatus"));
		getChartNamespaceResponse.setAutoCreateRepo(_ctx.booleanValue("GetChartNamespaceResponse.AutoCreateRepo"));
		getChartNamespaceResponse.setDefaultRepoType(_ctx.stringValue("GetChartNamespaceResponse.DefaultRepoType"));
		getChartNamespaceResponse.setInstanceId(_ctx.stringValue("GetChartNamespaceResponse.InstanceId"));
		getChartNamespaceResponse.setNamespaceId(_ctx.stringValue("GetChartNamespaceResponse.NamespaceId"));
	 
	 	return getChartNamespaceResponse;
	}
}
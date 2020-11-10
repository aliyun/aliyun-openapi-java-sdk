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

package com.aliyuncs.ververica.transform.v20200501;

import com.aliyuncs.ververica.model.v20200501.ListDeploymentsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeploymentsResponseUnmarshaller {

	public static ListDeploymentsResponse unmarshall(ListDeploymentsResponse listDeploymentsResponse, UnmarshallerContext _ctx) {
		
		listDeploymentsResponse.setData(_ctx.stringValue("ListDeploymentsResponse.data"));
		listDeploymentsResponse.setRequestId(_ctx.stringValue("ListDeploymentsResponse.requestId"));
	 
	 	return listDeploymentsResponse;
	}
}
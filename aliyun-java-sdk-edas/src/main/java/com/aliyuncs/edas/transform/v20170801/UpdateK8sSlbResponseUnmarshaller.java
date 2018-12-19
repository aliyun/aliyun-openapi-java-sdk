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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.UpdateK8sSlbResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateK8sSlbResponseUnmarshaller {

	public static UpdateK8sSlbResponse unmarshall(UpdateK8sSlbResponse updateK8sSlbResponse, UnmarshallerContext context) {
		
		updateK8sSlbResponse.setRequestId(context.stringValue("UpdateK8sSlbResponse.RequestId"));
		updateK8sSlbResponse.setCode(context.integerValue("UpdateK8sSlbResponse.Code"));
		updateK8sSlbResponse.setMessage(context.stringValue("UpdateK8sSlbResponse.Message"));
		updateK8sSlbResponse.setChangeOrderId(context.stringValue("UpdateK8sSlbResponse.ChangeOrderId"));
	 
	 	return updateK8sSlbResponse;
	}
}
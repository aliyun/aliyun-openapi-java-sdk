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

import com.aliyuncs.edas.model.v20170801.UnbindK8sSlbResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindK8sSlbResponseUnmarshaller {

	public static UnbindK8sSlbResponse unmarshall(UnbindK8sSlbResponse unbindK8sSlbResponse, UnmarshallerContext _ctx) {
		
		unbindK8sSlbResponse.setRequestId(_ctx.stringValue("UnbindK8sSlbResponse.RequestId"));
		unbindK8sSlbResponse.setCode(_ctx.integerValue("UnbindK8sSlbResponse.Code"));
		unbindK8sSlbResponse.setMessage(_ctx.stringValue("UnbindK8sSlbResponse.Message"));
		unbindK8sSlbResponse.setChangeOrderId(_ctx.stringValue("UnbindK8sSlbResponse.ChangeOrderId"));
	 
	 	return unbindK8sSlbResponse;
	}
}
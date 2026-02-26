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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.DeleteAddonReleaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAddonReleaseResponseUnmarshaller {

	public static DeleteAddonReleaseResponse unmarshall(DeleteAddonReleaseResponse deleteAddonReleaseResponse, UnmarshallerContext _ctx) {
		
		deleteAddonReleaseResponse.setRequestId(_ctx.stringValue("DeleteAddonReleaseResponse.RequestId"));
		deleteAddonReleaseResponse.setCode(_ctx.integerValue("DeleteAddonReleaseResponse.Code"));
		deleteAddonReleaseResponse.setMessage(_ctx.stringValue("DeleteAddonReleaseResponse.Message"));
		deleteAddonReleaseResponse.setSuccess(_ctx.booleanValue("DeleteAddonReleaseResponse.Success"));
		deleteAddonReleaseResponse.setData(_ctx.stringValue("DeleteAddonReleaseResponse.Data"));
	 
	 	return deleteAddonReleaseResponse;
	}
}
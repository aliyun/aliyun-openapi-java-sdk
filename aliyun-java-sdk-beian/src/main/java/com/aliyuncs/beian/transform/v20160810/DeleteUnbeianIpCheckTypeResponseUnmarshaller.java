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

package com.aliyuncs.beian.transform.v20160810;

import com.aliyuncs.beian.model.v20160810.DeleteUnbeianIpCheckTypeResponse;
import com.aliyuncs.beian.model.v20160810.DeleteUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUnbeianIpCheckTypeResponseUnmarshaller {

	public static DeleteUnbeianIpCheckTypeResponse unmarshall(DeleteUnbeianIpCheckTypeResponse deleteUnbeianIpCheckTypeResponse, UnmarshallerContext _ctx) {
		
		deleteUnbeianIpCheckTypeResponse.setRequestId(_ctx.stringValue("DeleteUnbeianIpCheckTypeResponse.RequestId"));
		deleteUnbeianIpCheckTypeResponse.setErrorMessage(_ctx.stringValue("DeleteUnbeianIpCheckTypeResponse.ErrorMessage"));
		deleteUnbeianIpCheckTypeResponse.setSuccess(_ctx.booleanValue("DeleteUnbeianIpCheckTypeResponse.Success"));
		deleteUnbeianIpCheckTypeResponse.setErrorCode(_ctx.integerValue("DeleteUnbeianIpCheckTypeResponse.ErrorCode"));

		HuntressIpCheckTypeResultDO huntressIpCheckTypeResultDO = new HuntressIpCheckTypeResultDO();
		huntressIpCheckTypeResultDO.setMsg(_ctx.stringValue("DeleteUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.Msg"));
		huntressIpCheckTypeResultDO.setSuccess(_ctx.booleanValue("DeleteUnbeianIpCheckTypeResponse.HuntressIpCheckTypeResultDO.Success"));
		deleteUnbeianIpCheckTypeResponse.setHuntressIpCheckTypeResultDO(huntressIpCheckTypeResultDO);
	 
	 	return deleteUnbeianIpCheckTypeResponse;
	}
}
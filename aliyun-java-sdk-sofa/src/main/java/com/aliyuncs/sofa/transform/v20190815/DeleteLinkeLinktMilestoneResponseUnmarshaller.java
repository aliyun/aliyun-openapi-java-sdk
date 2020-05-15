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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinktMilestoneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinktMilestoneResponseUnmarshaller {

	public static DeleteLinkeLinktMilestoneResponse unmarshall(DeleteLinkeLinktMilestoneResponse deleteLinkeLinktMilestoneResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinktMilestoneResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinktMilestoneResponse.RequestId"));
		deleteLinkeLinktMilestoneResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinktMilestoneResponse.ResultCode"));
		deleteLinkeLinktMilestoneResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinktMilestoneResponse.ResultMessage"));
		deleteLinkeLinktMilestoneResponse.setData(_ctx.booleanValue("DeleteLinkeLinktMilestoneResponse.Data"));
		deleteLinkeLinktMilestoneResponse.setErrorCode(_ctx.longValue("DeleteLinkeLinktMilestoneResponse.ErrorCode"));
		deleteLinkeLinktMilestoneResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeLinktMilestoneResponse.ErrorMessage"));
		deleteLinkeLinktMilestoneResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinktMilestoneResponse.Success"));
	 
	 	return deleteLinkeLinktMilestoneResponse;
	}
}
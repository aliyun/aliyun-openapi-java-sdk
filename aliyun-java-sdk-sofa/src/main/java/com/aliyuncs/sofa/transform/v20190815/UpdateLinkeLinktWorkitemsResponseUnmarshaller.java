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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemsResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktWorkitemsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktWorkitemsResponseUnmarshaller {

	public static UpdateLinkeLinktWorkitemsResponse unmarshall(UpdateLinkeLinktWorkitemsResponse updateLinkeLinktWorkitemsResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktWorkitemsResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktWorkitemsResponse.RequestId"));
		updateLinkeLinktWorkitemsResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktWorkitemsResponse.ResultCode"));
		updateLinkeLinktWorkitemsResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktWorkitemsResponse.ResultMessage"));
		updateLinkeLinktWorkitemsResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktWorkitemsResponse.ErrorCode"));
		updateLinkeLinktWorkitemsResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktWorkitemsResponse.ErrorMessage"));
		updateLinkeLinktWorkitemsResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktWorkitemsResponse.ResponseStatusCode"));
		updateLinkeLinktWorkitemsResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktWorkitemsResponse.Success"));

		Data data = new Data();
		data.setAllSuccess(_ctx.booleanValue("UpdateLinkeLinktWorkitemsResponse.Data.AllSuccess"));

		List<String> modifyFailedItems = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktWorkitemsResponse.Data.ModifyFailedItems.Length"); i++) {
			modifyFailedItems.add(_ctx.stringValue("UpdateLinkeLinktWorkitemsResponse.Data.ModifyFailedItems["+ i +"]"));
		}
		data.setModifyFailedItems(modifyFailedItems);
		updateLinkeLinktWorkitemsResponse.setData(data);
	 
	 	return updateLinkeLinktWorkitemsResponse;
	}
}
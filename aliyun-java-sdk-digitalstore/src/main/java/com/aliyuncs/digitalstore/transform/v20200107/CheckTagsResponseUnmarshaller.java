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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.CheckTagsResponse;
import com.aliyuncs.digitalstore.model.v20200107.CheckTagsResponse.CheckTagResultBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckTagsResponseUnmarshaller {

	public static CheckTagsResponse unmarshall(CheckTagsResponse checkTagsResponse, UnmarshallerContext _ctx) {
		
		checkTagsResponse.setRequestId(_ctx.stringValue("CheckTagsResponse.RequestId"));
		checkTagsResponse.setSuccess(_ctx.booleanValue("CheckTagsResponse.Success"));

		List<CheckTagResultBiz> checkResult = new ArrayList<CheckTagResultBiz>();
		for (int i = 0; i < _ctx.lengthValue("CheckTagsResponse.CheckResult.Length"); i++) {
			CheckTagResultBiz checkTagResultBiz = new CheckTagResultBiz();
			checkTagResultBiz.setTagValue(_ctx.stringValue("CheckTagsResponse.CheckResult["+ i +"].TagValue"));
			checkTagResultBiz.setTagId(_ctx.stringValue("CheckTagsResponse.CheckResult["+ i +"].TagId"));
			checkTagResultBiz.setBarcode(_ctx.stringValue("CheckTagsResponse.CheckResult["+ i +"].Barcode"));
			checkTagResultBiz.setIsExist(_ctx.integerValue("CheckTagsResponse.CheckResult["+ i +"].IsExist"));

			checkResult.add(checkTagResultBiz);
		}
		checkTagsResponse.setCheckResult(checkResult);
	 
	 	return checkTagsResponse;
	}
}
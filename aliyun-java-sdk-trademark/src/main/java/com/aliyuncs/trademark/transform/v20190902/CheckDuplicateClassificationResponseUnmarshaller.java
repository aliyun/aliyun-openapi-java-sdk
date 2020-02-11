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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.CheckDuplicateClassificationResponse;
import com.aliyuncs.trademark.model.v20190902.CheckDuplicateClassificationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDuplicateClassificationResponseUnmarshaller {

	public static CheckDuplicateClassificationResponse unmarshall(CheckDuplicateClassificationResponse checkDuplicateClassificationResponse, UnmarshallerContext _ctx) {
		
		checkDuplicateClassificationResponse.setRequestId(_ctx.stringValue("CheckDuplicateClassificationResponse.RequestId"));
		checkDuplicateClassificationResponse.setMessage(_ctx.stringValue("CheckDuplicateClassificationResponse.Message"));
		checkDuplicateClassificationResponse.setCode(_ctx.stringValue("CheckDuplicateClassificationResponse.Code"));

		Data data = new Data();
		data.setTrademarkName(_ctx.stringValue("CheckDuplicateClassificationResponse.Data.TrademarkName"));

		List<String> duplicateSecondaryClassification = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckDuplicateClassificationResponse.Data.DuplicateSecondaryClassification.Length"); i++) {
			duplicateSecondaryClassification.add(_ctx.stringValue("CheckDuplicateClassificationResponse.Data.DuplicateSecondaryClassification["+ i +"]"));
		}
		data.setDuplicateSecondaryClassification(duplicateSecondaryClassification);
		checkDuplicateClassificationResponse.setData(data);
	 
	 	return checkDuplicateClassificationResponse;
	}
}
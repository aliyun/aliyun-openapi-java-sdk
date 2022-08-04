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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.CheckIfCollectedResponse;
import com.aliyuncs.trademark.model.v20180724.CheckIfCollectedResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckIfCollectedResponseUnmarshaller {

	public static CheckIfCollectedResponse unmarshall(CheckIfCollectedResponse checkIfCollectedResponse, UnmarshallerContext _ctx) {
		
		checkIfCollectedResponse.setRequestId(_ctx.stringValue("CheckIfCollectedResponse.RequestId"));
		checkIfCollectedResponse.setCurrentPageNum(_ctx.integerValue("CheckIfCollectedResponse.CurrentPageNum"));
		checkIfCollectedResponse.setTotalPageNum(_ctx.integerValue("CheckIfCollectedResponse.TotalPageNum"));
		checkIfCollectedResponse.setPageSize(_ctx.integerValue("CheckIfCollectedResponse.PageSize"));
		checkIfCollectedResponse.setTotalItemNum(_ctx.integerValue("CheckIfCollectedResponse.TotalItemNum"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("CheckIfCollectedResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setItemIdList(_ctx.stringValue("CheckIfCollectedResponse.Data["+ i +"].ItemIdList"));
			trademark.setType(_ctx.integerValue("CheckIfCollectedResponse.Data["+ i +"].Type"));
			trademark.setName(_ctx.stringValue("CheckIfCollectedResponse.Data["+ i +"].Name"));
			trademark.setId(_ctx.longValue("CheckIfCollectedResponse.Data["+ i +"].Id"));

			data.add(trademark);
		}
		checkIfCollectedResponse.setData(data);
	 
	 	return checkIfCollectedResponse;
	}
}
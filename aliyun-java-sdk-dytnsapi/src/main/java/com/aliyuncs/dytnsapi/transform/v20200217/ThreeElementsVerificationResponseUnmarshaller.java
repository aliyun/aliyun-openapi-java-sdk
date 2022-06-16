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

package com.aliyuncs.dytnsapi.transform.v20200217;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dytnsapi.model.v20200217.ThreeElementsVerificationResponse;
import com.aliyuncs.dytnsapi.model.v20200217.ThreeElementsVerificationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ThreeElementsVerificationResponseUnmarshaller {

	public static ThreeElementsVerificationResponse unmarshall(ThreeElementsVerificationResponse threeElementsVerificationResponse, UnmarshallerContext _ctx) {
		
		threeElementsVerificationResponse.setRequestId(_ctx.stringValue("ThreeElementsVerificationResponse.RequestId"));
		threeElementsVerificationResponse.setCode(_ctx.stringValue("ThreeElementsVerificationResponse.Code"));
		threeElementsVerificationResponse.setMessage(_ctx.stringValue("ThreeElementsVerificationResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ThreeElementsVerificationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIsConsistent(_ctx.integerValue("ThreeElementsVerificationResponse.Data["+ i +"].IsConsistent"));
			dataItem.setBasicCarrier(_ctx.stringValue("ThreeElementsVerificationResponse.Data["+ i +"].BasicCarrier"));

			data.add(dataItem);
		}
		threeElementsVerificationResponse.setData(data);
	 
	 	return threeElementsVerificationResponse;
	}
}
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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.DescribeBaseAgeDataResponse;
import com.aliyuncs.reid.model.v20190928.DescribeBaseAgeDataResponse.AgeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBaseAgeDataResponseUnmarshaller {

	public static DescribeBaseAgeDataResponse unmarshall(DescribeBaseAgeDataResponse describeBaseAgeDataResponse, UnmarshallerContext _ctx) {
		
		describeBaseAgeDataResponse.setRequestId(_ctx.stringValue("DescribeBaseAgeDataResponse.RequestId"));
		describeBaseAgeDataResponse.setSummaryType(_ctx.stringValue("DescribeBaseAgeDataResponse.SummaryType"));
		describeBaseAgeDataResponse.setSuccess(_ctx.booleanValue("DescribeBaseAgeDataResponse.Success"));
		describeBaseAgeDataResponse.setDynamicMessage(_ctx.stringValue("DescribeBaseAgeDataResponse.DynamicMessage"));
		describeBaseAgeDataResponse.setStoreId(_ctx.longValue("DescribeBaseAgeDataResponse.StoreId"));
		describeBaseAgeDataResponse.setErrorCode(_ctx.stringValue("DescribeBaseAgeDataResponse.ErrorCode"));
		describeBaseAgeDataResponse.setErrorMessage(_ctx.stringValue("DescribeBaseAgeDataResponse.ErrorMessage"));
		describeBaseAgeDataResponse.setLocationId(_ctx.longValue("DescribeBaseAgeDataResponse.LocationId"));
		describeBaseAgeDataResponse.setMessage(_ctx.stringValue("DescribeBaseAgeDataResponse.Message"));
		describeBaseAgeDataResponse.setHour(_ctx.stringValue("DescribeBaseAgeDataResponse.Hour"));
		describeBaseAgeDataResponse.setCode(_ctx.stringValue("DescribeBaseAgeDataResponse.Code"));
		describeBaseAgeDataResponse.setDynamicCode(_ctx.stringValue("DescribeBaseAgeDataResponse.DynamicCode"));
		describeBaseAgeDataResponse.setDay(_ctx.stringValue("DescribeBaseAgeDataResponse.Day"));

		List<AgeItem> maleAgeItems = new ArrayList<AgeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBaseAgeDataResponse.MaleAgeItems.Length"); i++) {
			AgeItem ageItem = new AgeItem();
			ageItem.setName(_ctx.stringValue("DescribeBaseAgeDataResponse.MaleAgeItems["+ i +"].Name"));
			ageItem.setCount(_ctx.integerValue("DescribeBaseAgeDataResponse.MaleAgeItems["+ i +"].Count"));

			maleAgeItems.add(ageItem);
		}
		describeBaseAgeDataResponse.setMaleAgeItems(maleAgeItems);

		List<AgeItem> ageItems = new ArrayList<AgeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBaseAgeDataResponse.AgeItems.Length"); i++) {
			AgeItem ageItem_ = new AgeItem();
			ageItem_.setName(_ctx.stringValue("DescribeBaseAgeDataResponse.AgeItems["+ i +"].Name"));
			ageItem_.setCount(_ctx.integerValue("DescribeBaseAgeDataResponse.AgeItems["+ i +"].Count"));

			ageItems.add(ageItem_);
		}
		describeBaseAgeDataResponse.setAgeItems(ageItems);

		List<AgeItem> femaleAgeItems = new ArrayList<AgeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBaseAgeDataResponse.FemaleAgeItems.Length"); i++) {
			AgeItem ageItem_ = new AgeItem();
			ageItem_.setName(_ctx.stringValue("DescribeBaseAgeDataResponse.FemaleAgeItems["+ i +"].Name"));
			ageItem_.setCount(_ctx.integerValue("DescribeBaseAgeDataResponse.FemaleAgeItems["+ i +"].Count"));

			femaleAgeItems.add(ageItem_);
		}
		describeBaseAgeDataResponse.setFemaleAgeItems(femaleAgeItems);
	 
	 	return describeBaseAgeDataResponse;
	}
}
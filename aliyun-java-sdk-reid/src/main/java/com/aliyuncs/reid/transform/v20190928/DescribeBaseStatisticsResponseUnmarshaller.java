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

import com.aliyuncs.reid.model.v20190928.DescribeBaseStatisticsResponse;
import com.aliyuncs.reid.model.v20190928.DescribeBaseStatisticsResponse.BaseStatisticsItem;
import com.aliyuncs.reid.model.v20190928.DescribeBaseStatisticsResponse.BaseStatisticsItem.AgeItem;
import com.aliyuncs.reid.model.v20190928.DescribeBaseStatisticsResponse.BaseStatisticsItem.StayDistributionItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBaseStatisticsResponseUnmarshaller {

	public static DescribeBaseStatisticsResponse unmarshall(DescribeBaseStatisticsResponse describeBaseStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeBaseStatisticsResponse.setRequestId(_ctx.stringValue("DescribeBaseStatisticsResponse.RequestId"));
		describeBaseStatisticsResponse.setErrorCode(_ctx.stringValue("DescribeBaseStatisticsResponse.ErrorCode"));
		describeBaseStatisticsResponse.setCursorTime(_ctx.stringValue("DescribeBaseStatisticsResponse.CursorTime"));
		describeBaseStatisticsResponse.setErrorMessage(_ctx.stringValue("DescribeBaseStatisticsResponse.ErrorMessage"));
		describeBaseStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeBaseStatisticsResponse.Success"));

		List<BaseStatisticsItem> baseStatistics = new ArrayList<BaseStatisticsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBaseStatisticsResponse.BaseStatistics.Length"); i++) {
			BaseStatisticsItem baseStatisticsItem = new BaseStatisticsItem();
			baseStatisticsItem.setStoreId(_ctx.longValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].StoreId"));
			baseStatisticsItem.setFemaleUvCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].FemaleUvCount"));
			baseStatisticsItem.setOldCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].OldCount"));
			baseStatisticsItem.setNewCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].NewCount"));
			baseStatisticsItem.setSummaryType(_ctx.stringValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].SummaryType"));
			baseStatisticsItem.setMaleUvCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].MaleUvCount"));
			baseStatisticsItem.setTime(_ctx.stringValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].Time"));
			baseStatisticsItem.setLocationId(_ctx.longValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].LocationId"));
			baseStatisticsItem.setStayPeriod(_ctx.longValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].StayPeriod"));
			baseStatisticsItem.setUvCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].UvCount"));
			baseStatisticsItem.setOnlyBodyUvCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].OnlyBodyUvCount"));

			List<AgeItem> ageItems = new ArrayList<AgeItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].AgeItems.Length"); j++) {
				AgeItem ageItem = new AgeItem();
				ageItem.setName(_ctx.stringValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].AgeItems["+ j +"].Name"));
				ageItem.setCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].AgeItems["+ j +"].Count"));

				ageItems.add(ageItem);
			}
			baseStatisticsItem.setAgeItems(ageItems);

			List<StayDistributionItem> stayDistributionItems = new ArrayList<StayDistributionItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].StayDistributionItems.Length"); j++) {
				StayDistributionItem stayDistributionItem = new StayDistributionItem();
				stayDistributionItem.setStartTs(_ctx.longValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].StayDistributionItems["+ j +"].StartTs"));
				stayDistributionItem.setEndTs(_ctx.longValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].StayDistributionItems["+ j +"].EndTs"));
				stayDistributionItem.setCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].StayDistributionItems["+ j +"].Count"));

				stayDistributionItems.add(stayDistributionItem);
			}
			baseStatisticsItem.setStayDistributionItems(stayDistributionItems);

			List<AgeItem> maleAgeItems = new ArrayList<AgeItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].MaleAgeItems.Length"); j++) {
				AgeItem ageItem_ = new AgeItem();
				ageItem_.setName(_ctx.stringValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].MaleAgeItems["+ j +"].Name"));
				ageItem_.setCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].MaleAgeItems["+ j +"].Count"));

				maleAgeItems.add(ageItem_);
			}
			baseStatisticsItem.setMaleAgeItems(maleAgeItems);

			List<AgeItem> femaleAgeItems = new ArrayList<AgeItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].FemaleAgeItems.Length"); j++) {
				AgeItem ageItem_ = new AgeItem();
				ageItem_.setName(_ctx.stringValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].FemaleAgeItems["+ j +"].Name"));
				ageItem_.setCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].FemaleAgeItems["+ j +"].Count"));

				femaleAgeItems.add(ageItem_);
			}
			baseStatisticsItem.setFemaleAgeItems(femaleAgeItems);

			baseStatistics.add(baseStatisticsItem);
		}
		describeBaseStatisticsResponse.setBaseStatistics(baseStatistics);
	 
	 	return describeBaseStatisticsResponse;
	}
}
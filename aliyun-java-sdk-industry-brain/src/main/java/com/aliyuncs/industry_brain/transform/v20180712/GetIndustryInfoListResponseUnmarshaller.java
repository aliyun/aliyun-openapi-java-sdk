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

package com.aliyuncs.industry_brain.transform.v20180712;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.industry_brain.model.v20180712.GetIndustryInfoListResponse;
import com.aliyuncs.industry_brain.model.v20180712.GetIndustryInfoListResponse.IndustryInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIndustryInfoListResponseUnmarshaller {

	public static GetIndustryInfoListResponse unmarshall(GetIndustryInfoListResponse getIndustryInfoListResponse, UnmarshallerContext context) {
		
		getIndustryInfoListResponse.setRequestId(context.stringValue("GetIndustryInfoListResponse.RequestId"));

		List<IndustryInfoListItem> industryInfoList = new ArrayList<IndustryInfoListItem>();
		for (int i = 0; i < context.lengthValue("GetIndustryInfoListResponse.IndustryInfoList.Length"); i++) {
			IndustryInfoListItem industryInfoListItem = new IndustryInfoListItem();
			industryInfoListItem.setId(context.stringValue("GetIndustryInfoListResponse.IndustryInfoList["+ i +"].Id"));
			industryInfoListItem.setCode(context.stringValue("GetIndustryInfoListResponse.IndustryInfoList["+ i +"].Code"));
			industryInfoListItem.setName(context.stringValue("GetIndustryInfoListResponse.IndustryInfoList["+ i +"].Name"));
			industryInfoListItem.setLevel(context.stringValue("GetIndustryInfoListResponse.IndustryInfoList["+ i +"].Level"));

			industryInfoList.add(industryInfoListItem);
		}
		getIndustryInfoListResponse.setIndustryInfoList(industryInfoList);
	 
	 	return getIndustryInfoListResponse;
	}
}
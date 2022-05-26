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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.FindBizCategoryConfigResponse;
import com.aliyuncs.account_crm.model.v20160606.FindBizCategoryConfigResponse.BizCategory;
import com.aliyuncs.account_crm.model.v20160606.FindBizCategoryConfigResponse.BizCategory.BizSubCategory;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindBizCategoryConfigResponseUnmarshaller {

	public static FindBizCategoryConfigResponse unmarshall(FindBizCategoryConfigResponse findBizCategoryConfigResponse, UnmarshallerContext _ctx) {
		
		findBizCategoryConfigResponse.setRequestId(_ctx.stringValue("FindBizCategoryConfigResponse.RequestId"));
		findBizCategoryConfigResponse.setCode(_ctx.stringValue("FindBizCategoryConfigResponse.Code"));
		findBizCategoryConfigResponse.setMessage(_ctx.stringValue("FindBizCategoryConfigResponse.Message"));
		findBizCategoryConfigResponse.setSuccess(_ctx.booleanValue("FindBizCategoryConfigResponse.Success"));

		List<BizCategory> data = new ArrayList<BizCategory>();
		for (int i = 0; i < _ctx.lengthValue("FindBizCategoryConfigResponse.Data.Length"); i++) {
			BizCategory bizCategory = new BizCategory();
			bizCategory.setCode(_ctx.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].Code"));
			bizCategory.setMainBiz(_ctx.booleanValue("FindBizCategoryConfigResponse.Data["+ i +"].MainBiz"));
			bizCategory.setName(_ctx.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].Name"));
			bizCategory.setOther(_ctx.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].Other"));
			bizCategory.setIsCheck(_ctx.booleanValue("FindBizCategoryConfigResponse.Data["+ i +"].IsCheck"));

			List<BizSubCategory> subConfigs = new ArrayList<BizSubCategory>();
			for (int j = 0; j < _ctx.lengthValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs.Length"); j++) {
				BizSubCategory bizSubCategory = new BizSubCategory();
				bizSubCategory.setCode(_ctx.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].Code"));
				bizSubCategory.setMainBiz(_ctx.booleanValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].MainBiz"));
				bizSubCategory.setName(_ctx.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].Name"));
				bizSubCategory.setOther(_ctx.stringValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].Other"));
				bizSubCategory.setIsCheck(_ctx.booleanValue("FindBizCategoryConfigResponse.Data["+ i +"].SubConfigs["+ j +"].IsCheck"));

				subConfigs.add(bizSubCategory);
			}
			bizCategory.setSubConfigs(subConfigs);

			data.add(bizCategory);
		}
		findBizCategoryConfigResponse.setData(data);
	 
	 	return findBizCategoryConfigResponse;
	}
}
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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.GetAppRecommendedCommoditiesResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppRecommendedCommoditiesResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.GetAppRecommendedCommoditiesResponse.Module.Commoditie;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppRecommendedCommoditiesResponseUnmarshaller {

	public static GetAppRecommendedCommoditiesResponse unmarshall(GetAppRecommendedCommoditiesResponse getAppRecommendedCommoditiesResponse, UnmarshallerContext _ctx) {
		
		getAppRecommendedCommoditiesResponse.setRequestId(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.RequestId"));
		getAppRecommendedCommoditiesResponse.setDynamicCode(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.DynamicCode"));
		getAppRecommendedCommoditiesResponse.setDynamicMessage(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.DynamicMessage"));
		getAppRecommendedCommoditiesResponse.setSynchro(_ctx.booleanValue("GetAppRecommendedCommoditiesResponse.Synchro"));
		getAppRecommendedCommoditiesResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.AccessDeniedDetail"));
		getAppRecommendedCommoditiesResponse.setRootErrorMsg(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.RootErrorMsg"));
		getAppRecommendedCommoditiesResponse.setRootErrorCode(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.RootErrorCode"));
		getAppRecommendedCommoditiesResponse.setAllowRetry(_ctx.booleanValue("GetAppRecommendedCommoditiesResponse.AllowRetry"));
		getAppRecommendedCommoditiesResponse.setAppName(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppRecommendedCommoditiesResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.ErrorArgs["+ i +"]"));
		}
		getAppRecommendedCommoditiesResponse.setErrorArgs(errorArgs);

		Module module = new Module();

		List<Commoditie> commodities = new ArrayList<Commoditie>();
		for (int i = 0; i < _ctx.lengthValue("GetAppRecommendedCommoditiesResponse.Module.Commodities.Length"); i++) {
			Commoditie commoditie = new Commoditie();
			commoditie.setPromotionCommodityId(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.Module.Commodities["+ i +"].PromotionCommodityId"));
			commoditie.setCommodityCode(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.Module.Commodities["+ i +"].CommodityCode"));
			commoditie.setOrderType(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.Module.Commodities["+ i +"].OrderType"));
			commoditie.setRedirectUrl(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.Module.Commodities["+ i +"].RedirectUrl"));
			commoditie.setPriority(_ctx.integerValue("GetAppRecommendedCommoditiesResponse.Module.Commodities["+ i +"].Priority"));
			commoditie.setStatus(_ctx.stringValue("GetAppRecommendedCommoditiesResponse.Module.Commodities["+ i +"].Status"));
			commoditie.setExtend(_ctx.mapValue("GetAppRecommendedCommoditiesResponse.Module.Commodities["+ i +"].Extend"));

			commodities.add(commoditie);
		}
		module.setCommodities(commodities);
		getAppRecommendedCommoditiesResponse.setModule(module);
	 
	 	return getAppRecommendedCommoditiesResponse;
	}
}
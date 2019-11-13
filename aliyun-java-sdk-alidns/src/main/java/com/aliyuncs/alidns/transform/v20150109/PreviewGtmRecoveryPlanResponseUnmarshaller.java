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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.PreviewGtmRecoveryPlanResponse;
import com.aliyuncs.alidns.model.v20150109.PreviewGtmRecoveryPlanResponse.Preview;
import com.aliyuncs.alidns.model.v20150109.PreviewGtmRecoveryPlanResponse.Preview.SwitchInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreviewGtmRecoveryPlanResponseUnmarshaller {

	public static PreviewGtmRecoveryPlanResponse unmarshall(PreviewGtmRecoveryPlanResponse previewGtmRecoveryPlanResponse, UnmarshallerContext _ctx) {
		
		previewGtmRecoveryPlanResponse.setRequestId(_ctx.stringValue("PreviewGtmRecoveryPlanResponse.RequestId"));
		previewGtmRecoveryPlanResponse.setTotalItems(_ctx.integerValue("PreviewGtmRecoveryPlanResponse.TotalItems"));
		previewGtmRecoveryPlanResponse.setTotalPages(_ctx.integerValue("PreviewGtmRecoveryPlanResponse.TotalPages"));
		previewGtmRecoveryPlanResponse.setPageSize(_ctx.integerValue("PreviewGtmRecoveryPlanResponse.PageSize"));
		previewGtmRecoveryPlanResponse.setPageNumber(_ctx.integerValue("PreviewGtmRecoveryPlanResponse.PageNumber"));

		List<Preview> previews = new ArrayList<Preview>();
		for (int i = 0; i < _ctx.lengthValue("PreviewGtmRecoveryPlanResponse.Previews.Length"); i++) {
			Preview preview = new Preview();
			preview.setInstanceId(_ctx.stringValue("PreviewGtmRecoveryPlanResponse.Previews["+ i +"].InstanceId"));
			preview.setName(_ctx.stringValue("PreviewGtmRecoveryPlanResponse.Previews["+ i +"].Name"));
			preview.setUserDomainName(_ctx.stringValue("PreviewGtmRecoveryPlanResponse.Previews["+ i +"].UserDomainName"));

			List<SwitchInfo> switchInfos = new ArrayList<SwitchInfo>();
			for (int j = 0; j < _ctx.lengthValue("PreviewGtmRecoveryPlanResponse.Previews["+ i +"].SwitchInfos.Length"); j++) {
				SwitchInfo switchInfo = new SwitchInfo();
				switchInfo.setStrategyName(_ctx.stringValue("PreviewGtmRecoveryPlanResponse.Previews["+ i +"].SwitchInfos["+ j +"].StrategyName"));
				switchInfo.setContent(_ctx.stringValue("PreviewGtmRecoveryPlanResponse.Previews["+ i +"].SwitchInfos["+ j +"].Content"));

				switchInfos.add(switchInfo);
			}
			preview.setSwitchInfos(switchInfos);

			previews.add(preview);
		}
		previewGtmRecoveryPlanResponse.setPreviews(previews);
	 
	 	return previewGtmRecoveryPlanResponse;
	}
}
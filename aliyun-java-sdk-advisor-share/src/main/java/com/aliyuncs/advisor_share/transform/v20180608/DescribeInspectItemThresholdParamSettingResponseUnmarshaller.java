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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeInspectItemThresholdParamSettingResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeInspectItemThresholdParamSettingResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.DescribeInspectItemThresholdParamSettingResponse.Data.IndicatorItem;
import com.aliyuncs.advisor_share.model.v20180608.DescribeInspectItemThresholdParamSettingResponse.Data.IndicatorItem.ThresholdItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInspectItemThresholdParamSettingResponseUnmarshaller {

	public static DescribeInspectItemThresholdParamSettingResponse unmarshall(DescribeInspectItemThresholdParamSettingResponse describeInspectItemThresholdParamSettingResponse, UnmarshallerContext _ctx) {
		
		describeInspectItemThresholdParamSettingResponse.setRequestId(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.RequestId"));

		Data data = new Data();
		data.setInspectName(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.InspectName"));
		data.setCode(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Code"));
		data.setTips(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Tips"));
		data.setDescription(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Description"));
		data.setCategory(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Category"));

		List<IndicatorItem> indicator = new ArrayList<IndicatorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator.Length"); i++) {
			IndicatorItem indicatorItem = new IndicatorItem();
			indicatorItem.setGroup(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Group"));
			indicatorItem.setGroupKey(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].GroupKey"));
			indicatorItem.setOrder(_ctx.longValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Order"));

			List<ThresholdItem> threshold = new ArrayList<ThresholdItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold.Length"); j++) {
				ThresholdItem thresholdItem = new ThresholdItem();
				thresholdItem.setMax(_ctx.longValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold["+ j +"].Max"));
				thresholdItem.setMin(_ctx.longValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold["+ j +"].Min"));
				thresholdItem.setKey(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold["+ j +"].Key"));
				thresholdItem.setName(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold["+ j +"].Name"));
				thresholdItem.setOrder(_ctx.longValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold["+ j +"].Order"));
				thresholdItem.setValue(_ctx.longValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold["+ j +"].Value"));
				thresholdItem.setDefaultValue(_ctx.longValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold["+ j +"].DefaultValue"));
				thresholdItem.setUnit(_ctx.stringValue("DescribeInspectItemThresholdParamSettingResponse.Data.Indicator["+ i +"].Threshold["+ j +"].Unit"));

				threshold.add(thresholdItem);
			}
			indicatorItem.setThreshold(threshold);

			indicator.add(indicatorItem);
		}
		data.setIndicator(indicator);
		describeInspectItemThresholdParamSettingResponse.setData(data);
	 
	 	return describeInspectItemThresholdParamSettingResponse;
	}
}
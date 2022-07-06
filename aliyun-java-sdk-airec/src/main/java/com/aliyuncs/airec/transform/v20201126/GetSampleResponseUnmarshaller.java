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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.GetSampleResponse;
import com.aliyuncs.airec.model.v20201126.GetSampleResponse.Result;
import com.aliyuncs.airec.model.v20201126.GetSampleResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.GetSampleResponse.Result.Meta.Config;
import com.aliyuncs.airec.model.v20201126.GetSampleResponse.Result.Meta.Config.FeatureConfig;
import com.aliyuncs.airec.model.v20201126.GetSampleResponse.Result.Meta.Config.LabelLogic;
import com.aliyuncs.airec.model.v20201126.GetSampleResponse.Result.Meta.Config.WeightLogicListItem;
import com.aliyuncs.airec.model.v20201126.GetSampleResponse.Result.Meta.ExtendParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSampleResponseUnmarshaller {

	public static GetSampleResponse unmarshall(GetSampleResponse getSampleResponse, UnmarshallerContext _ctx) {
		
		getSampleResponse.setRequestId(_ctx.stringValue("GetSampleResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("GetSampleResponse.result.Status"));
		result.setGmtCreate(_ctx.stringValue("GetSampleResponse.result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("GetSampleResponse.result.GmtModified"));
		result.setSampleId(_ctx.stringValue("GetSampleResponse.result.SampleId"));

		Meta meta = new Meta();
		meta.setAutoUpdate(_ctx.booleanValue("GetSampleResponse.result.Meta.AutoUpdate"));
		meta.setAutoUpdateFrequency(_ctx.longValue("GetSampleResponse.result.Meta.AutoUpdateFrequency"));
		meta.setClonedId(_ctx.stringValue("GetSampleResponse.result.Meta.ClonedId"));
		meta.setMetaType(_ctx.stringValue("GetSampleResponse.result.Meta.MetaType"));
		meta.setName(_ctx.stringValue("GetSampleResponse.result.Meta.Name"));
		meta.setStoreConfig(_ctx.stringValue("GetSampleResponse.result.Meta.StoreConfig"));
		meta.setType(_ctx.stringValue("GetSampleResponse.result.Meta.Type"));

		Config config = new Config();

		List<String> bhvTableSourceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSampleResponse.result.Meta.Config.BhvTableSourceIds.Length"); i++) {
			bhvTableSourceIds.add(_ctx.stringValue("GetSampleResponse.result.Meta.Config.BhvTableSourceIds["+ i +"]"));
		}
		config.setBhvTableSourceIds(bhvTableSourceIds);

		FeatureConfig featureConfig = new FeatureConfig();
		featureConfig.setItemFeatures(_ctx.stringValue("GetSampleResponse.result.Meta.Config.FeatureConfig.ItemFeatures"));
		featureConfig.setUserFeatures(_ctx.stringValue("GetSampleResponse.result.Meta.Config.FeatureConfig.UserFeatures"));
		config.setFeatureConfig(featureConfig);

		LabelLogic labelLogic = new LabelLogic();
		labelLogic.setBhvTimeWindow(_ctx.longValue("GetSampleResponse.result.Meta.Config.LabelLogic.BhvTimeWindow"));
		labelLogic.setNegativeBhvTypes(_ctx.stringValue("GetSampleResponse.result.Meta.Config.LabelLogic.NegativeBhvTypes"));
		labelLogic.setPositiveBhvTypes(_ctx.stringValue("GetSampleResponse.result.Meta.Config.LabelLogic.PositiveBhvTypes"));
		config.setLabelLogic(labelLogic);

		List<WeightLogicListItem> weightLogicList = new ArrayList<WeightLogicListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSampleResponse.result.Meta.Config.WeightLogicList.Length"); i++) {
			WeightLogicListItem weightLogicListItem = new WeightLogicListItem();
			weightLogicListItem.setBhv(_ctx.stringValue("GetSampleResponse.result.Meta.Config.WeightLogicList["+ i +"].Bhv"));
			weightLogicListItem.setWeight(_ctx.stringValue("GetSampleResponse.result.Meta.Config.WeightLogicList["+ i +"].Weight"));

			weightLogicList.add(weightLogicListItem);
		}
		config.setWeightLogicList(weightLogicList);
		meta.setConfig(config);

		ExtendParams extendParams = new ExtendParams();
		extendParams.setLatestTaskStatus(_ctx.longValue("GetSampleResponse.result.Meta.ExtendParams.LatestTaskStatus"));
		extendParams.setSampleCount(_ctx.longValue("GetSampleResponse.result.Meta.ExtendParams.SampleCount"));
		meta.setExtendParams(extendParams);
		result.setMeta(meta);
		getSampleResponse.setResult(result);
	 
	 	return getSampleResponse;
	}
}
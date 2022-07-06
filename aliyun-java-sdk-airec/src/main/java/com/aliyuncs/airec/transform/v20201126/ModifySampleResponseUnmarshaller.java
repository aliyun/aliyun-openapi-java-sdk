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

import com.aliyuncs.airec.model.v20201126.ModifySampleResponse;
import com.aliyuncs.airec.model.v20201126.ModifySampleResponse.Result;
import com.aliyuncs.airec.model.v20201126.ModifySampleResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.ModifySampleResponse.Result.Meta.Config;
import com.aliyuncs.airec.model.v20201126.ModifySampleResponse.Result.Meta.Config.FeatureConfig;
import com.aliyuncs.airec.model.v20201126.ModifySampleResponse.Result.Meta.Config.LabelLogic;
import com.aliyuncs.airec.model.v20201126.ModifySampleResponse.Result.Meta.Config.WeightLogicListItem;
import com.aliyuncs.airec.model.v20201126.ModifySampleResponse.Result.Meta.ExtendParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySampleResponseUnmarshaller {

	public static ModifySampleResponse unmarshall(ModifySampleResponse modifySampleResponse, UnmarshallerContext _ctx) {
		
		modifySampleResponse.setRequestId(_ctx.stringValue("ModifySampleResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("ModifySampleResponse.result.Status"));
		result.setGmtCreate(_ctx.stringValue("ModifySampleResponse.result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifySampleResponse.result.GmtModified"));
		result.setSampleId(_ctx.stringValue("ModifySampleResponse.result.SampleId"));

		Meta meta = new Meta();
		meta.setAutoUpdate(_ctx.booleanValue("ModifySampleResponse.result.Meta.AutoUpdate"));
		meta.setAutoUpdateFrequency(_ctx.longValue("ModifySampleResponse.result.Meta.AutoUpdateFrequency"));
		meta.setClonedId(_ctx.stringValue("ModifySampleResponse.result.Meta.ClonedId"));
		meta.setMetaType(_ctx.stringValue("ModifySampleResponse.result.Meta.MetaType"));
		meta.setName(_ctx.stringValue("ModifySampleResponse.result.Meta.Name"));
		meta.setStoreConfig(_ctx.stringValue("ModifySampleResponse.result.Meta.StoreConfig"));
		meta.setType(_ctx.stringValue("ModifySampleResponse.result.Meta.Type"));

		Config config = new Config();

		List<String> bhvTableSourceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifySampleResponse.result.Meta.Config.BhvTableSourceIds.Length"); i++) {
			bhvTableSourceIds.add(_ctx.stringValue("ModifySampleResponse.result.Meta.Config.BhvTableSourceIds["+ i +"]"));
		}
		config.setBhvTableSourceIds(bhvTableSourceIds);

		FeatureConfig featureConfig = new FeatureConfig();
		featureConfig.setItemFeatures(_ctx.stringValue("ModifySampleResponse.result.Meta.Config.FeatureConfig.ItemFeatures"));
		featureConfig.setUserFeatures(_ctx.stringValue("ModifySampleResponse.result.Meta.Config.FeatureConfig.UserFeatures"));
		config.setFeatureConfig(featureConfig);

		LabelLogic labelLogic = new LabelLogic();
		labelLogic.setBhvTimeWindow(_ctx.longValue("ModifySampleResponse.result.Meta.Config.LabelLogic.BhvTimeWindow"));
		labelLogic.setNegativeBhvTypes(_ctx.stringValue("ModifySampleResponse.result.Meta.Config.LabelLogic.NegativeBhvTypes"));
		labelLogic.setPositiveBhvTypes(_ctx.stringValue("ModifySampleResponse.result.Meta.Config.LabelLogic.PositiveBhvTypes"));
		config.setLabelLogic(labelLogic);

		List<WeightLogicListItem> weightLogicList = new ArrayList<WeightLogicListItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifySampleResponse.result.Meta.Config.WeightLogicList.Length"); i++) {
			WeightLogicListItem weightLogicListItem = new WeightLogicListItem();
			weightLogicListItem.setBhv(_ctx.stringValue("ModifySampleResponse.result.Meta.Config.WeightLogicList["+ i +"].Bhv"));
			weightLogicListItem.setWeight(_ctx.stringValue("ModifySampleResponse.result.Meta.Config.WeightLogicList["+ i +"].Weight"));

			weightLogicList.add(weightLogicListItem);
		}
		config.setWeightLogicList(weightLogicList);
		meta.setConfig(config);

		ExtendParams extendParams = new ExtendParams();
		extendParams.setLatestTaskStatus(_ctx.longValue("ModifySampleResponse.result.Meta.ExtendParams.LatestTaskStatus"));
		extendParams.setSampleCount(_ctx.longValue("ModifySampleResponse.result.Meta.ExtendParams.SampleCount"));
		meta.setExtendParams(extendParams);
		result.setMeta(meta);
		modifySampleResponse.setResult(result);
	 
	 	return modifySampleResponse;
	}
}
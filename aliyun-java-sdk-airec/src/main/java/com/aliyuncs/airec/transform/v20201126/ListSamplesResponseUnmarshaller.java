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

import com.aliyuncs.airec.model.v20201126.ListSamplesResponse;
import com.aliyuncs.airec.model.v20201126.ListSamplesResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListSamplesResponse.ResultItem.Meta;
import com.aliyuncs.airec.model.v20201126.ListSamplesResponse.ResultItem.Meta.Config;
import com.aliyuncs.airec.model.v20201126.ListSamplesResponse.ResultItem.Meta.Config.FeatureConfig;
import com.aliyuncs.airec.model.v20201126.ListSamplesResponse.ResultItem.Meta.Config.LabelLogic;
import com.aliyuncs.airec.model.v20201126.ListSamplesResponse.ResultItem.Meta.Config.WeightLogicListItem;
import com.aliyuncs.airec.model.v20201126.ListSamplesResponse.ResultItem.Meta.ExtendParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSamplesResponseUnmarshaller {

	public static ListSamplesResponse unmarshall(ListSamplesResponse listSamplesResponse, UnmarshallerContext _ctx) {
		
		listSamplesResponse.setRequestId(_ctx.stringValue("ListSamplesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSamplesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setStatus(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Status"));
			resultItem.setGmtCreate(_ctx.stringValue("ListSamplesResponse.result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListSamplesResponse.result["+ i +"].GmtModified"));
			resultItem.setSampleId(_ctx.stringValue("ListSamplesResponse.result["+ i +"].SampleId"));

			Meta meta = new Meta();
			meta.setAutoUpdate(_ctx.booleanValue("ListSamplesResponse.result["+ i +"].Meta.AutoUpdate"));
			meta.setAutoUpdateFrequency(_ctx.longValue("ListSamplesResponse.result["+ i +"].Meta.AutoUpdateFrequency"));
			meta.setClonedId(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.ClonedId"));
			meta.setMetaType(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.MetaType"));
			meta.setName(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Name"));
			meta.setStoreConfig(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.StoreConfig"));
			meta.setType(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Type"));

			Config config = new Config();

			List<String> bhvTableSourceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSamplesResponse.result["+ i +"].Meta.Config.BhvTableSourceIds.Length"); j++) {
				bhvTableSourceIds.add(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Config.BhvTableSourceIds["+ j +"]"));
			}
			config.setBhvTableSourceIds(bhvTableSourceIds);

			FeatureConfig featureConfig = new FeatureConfig();
			featureConfig.setItemFeatures(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Config.FeatureConfig.ItemFeatures"));
			featureConfig.setUserFeatures(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Config.FeatureConfig.UserFeatures"));
			config.setFeatureConfig(featureConfig);

			LabelLogic labelLogic = new LabelLogic();
			labelLogic.setBhvTimeWindow(_ctx.longValue("ListSamplesResponse.result["+ i +"].Meta.Config.LabelLogic.BhvTimeWindow"));
			labelLogic.setNegativeBhvTypes(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Config.LabelLogic.NegativeBhvTypes"));
			labelLogic.setPositiveBhvTypes(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Config.LabelLogic.PositiveBhvTypes"));
			config.setLabelLogic(labelLogic);

			List<WeightLogicListItem> weightLogicList = new ArrayList<WeightLogicListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSamplesResponse.result["+ i +"].Meta.Config.WeightLogicList.Length"); j++) {
				WeightLogicListItem weightLogicListItem = new WeightLogicListItem();
				weightLogicListItem.setBhv(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Config.WeightLogicList["+ j +"].Bhv"));
				weightLogicListItem.setWeight(_ctx.stringValue("ListSamplesResponse.result["+ i +"].Meta.Config.WeightLogicList["+ j +"].Weight"));

				weightLogicList.add(weightLogicListItem);
			}
			config.setWeightLogicList(weightLogicList);
			meta.setConfig(config);

			ExtendParams extendParams = new ExtendParams();
			extendParams.setLatestTaskStatus(_ctx.longValue("ListSamplesResponse.result["+ i +"].Meta.ExtendParams.LatestTaskStatus"));
			extendParams.setSampleCount(_ctx.longValue("ListSamplesResponse.result["+ i +"].Meta.ExtendParams.SampleCount"));
			meta.setExtendParams(extendParams);
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		listSamplesResponse.setResult(result);
	 
	 	return listSamplesResponse;
	}
}
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

import com.aliyuncs.airec.model.v20201126.UpdateExperimentBasicInfoResponse;
import com.aliyuncs.airec.model.v20201126.UpdateExperimentBasicInfoResponse.Result;
import com.aliyuncs.airec.model.v20201126.UpdateExperimentBasicInfoResponse.Result.Algorithm;
import com.aliyuncs.airec.model.v20201126.UpdateExperimentBasicInfoResponse.Result.Algorithm.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateExperimentBasicInfoResponseUnmarshaller {

	public static UpdateExperimentBasicInfoResponse unmarshall(UpdateExperimentBasicInfoResponse updateExperimentBasicInfoResponse, UnmarshallerContext _ctx) {
		
		updateExperimentBasicInfoResponse.setRequestId(_ctx.stringValue("UpdateExperimentBasicInfoResponse.requestId"));

		Result result = new Result();
		result.setBase(_ctx.booleanValue("UpdateExperimentBasicInfoResponse.result.base"));
		result.setOnlineTime(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.onlineTime"));
		result.setOfflineTime(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.offlineTime"));
		result.setDescription(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.description"));
		result.setStatus(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.status"));
		result.setName(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.name"));
		result.setExperimentId(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.experimentId"));

		List<String> buckets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateExperimentBasicInfoResponse.result.buckets.Length"); i++) {
			buckets.add(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.buckets["+ i +"]"));
		}
		result.setBuckets(buckets);

		List<Algorithm> algorithms = new ArrayList<Algorithm>();
		for (int i = 0; i < _ctx.lengthValue("UpdateExperimentBasicInfoResponse.result.algorithms.Length"); i++) {
			Algorithm algorithm = new Algorithm();
			algorithm.setKey(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].key"));
			algorithm.setDefaultValue(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].defaultValue"));
			algorithm.setType(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].type"));
			algorithm.setExperimentValue(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].experimentValue"));
			algorithm.setHasConfig(_ctx.booleanValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].hasConfig"));
			algorithm.setCategory(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].category"));
			algorithm.setName(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].name"));

			List<ConfigItem> config = new ArrayList<ConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].config.Length"); j++) {
				ConfigItem configItem = new ConfigItem();
				configItem.setKey(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].config["+ j +"].key"));
				configItem.setDefaultValue(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].config["+ j +"].defaultValue"));
				configItem.setExperimentValue(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].config["+ j +"].experimentValue"));
				configItem.setName(_ctx.stringValue("UpdateExperimentBasicInfoResponse.result.algorithms["+ i +"].config["+ j +"].name"));

				config.add(configItem);
			}
			algorithm.setConfig(config);

			algorithms.add(algorithm);
		}
		result.setAlgorithms(algorithms);
		updateExperimentBasicInfoResponse.setResult(result);
	 
	 	return updateExperimentBasicInfoResponse;
	}
}
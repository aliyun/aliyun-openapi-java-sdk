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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.DescribeEnvironmentFeatureResponse;
import com.aliyuncs.arms.model.v20190808.DescribeEnvironmentFeatureResponse.Data;
import com.aliyuncs.arms.model.v20190808.DescribeEnvironmentFeatureResponse.Data.Feature;
import com.aliyuncs.arms.model.v20190808.DescribeEnvironmentFeatureResponse.Data.FeatureStatus;
import com.aliyuncs.arms.model.v20190808.DescribeEnvironmentFeatureResponse.Data.FeatureStatus.FeatureContainersItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnvironmentFeatureResponseUnmarshaller {

	public static DescribeEnvironmentFeatureResponse unmarshall(DescribeEnvironmentFeatureResponse describeEnvironmentFeatureResponse, UnmarshallerContext _ctx) {
		
		describeEnvironmentFeatureResponse.setRequestId(_ctx.stringValue("DescribeEnvironmentFeatureResponse.RequestId"));
		describeEnvironmentFeatureResponse.setCode(_ctx.integerValue("DescribeEnvironmentFeatureResponse.Code"));
		describeEnvironmentFeatureResponse.setMessage(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Message"));
		describeEnvironmentFeatureResponse.setSuccess(_ctx.booleanValue("DescribeEnvironmentFeatureResponse.Success"));

		Data data = new Data();

		Feature feature = new Feature();
		feature.setAlias(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.Alias"));
		feature.setConfig(_ctx.mapValue("DescribeEnvironmentFeatureResponse.Data.Feature.Config"));
		feature.setDescription(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.Description"));
		feature.setEnvironmentId(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.EnvironmentId"));
		feature.setIcon(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.Icon"));
		feature.setLanguage(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.Language"));
		feature.setLatestVersion(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.LatestVersion"));
		feature.setName(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.Name"));
		feature.setStatus(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.Status"));
		feature.setVersion(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.Feature.Version"));
		feature.setManaged(_ctx.booleanValue("DescribeEnvironmentFeatureResponse.Data.Feature.Managed"));
		data.setFeature(feature);

		FeatureStatus featureStatus = new FeatureStatus();
		featureStatus.setName(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.FeatureStatus.Name"));
		featureStatus.setNamespace(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.FeatureStatus.Namespace"));
		featureStatus.setStatus(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.FeatureStatus.Status"));

		List<FeatureContainersItem> featureContainers = new ArrayList<FeatureContainersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnvironmentFeatureResponse.Data.FeatureStatus.FeatureContainers.Length"); i++) {
			FeatureContainersItem featureContainersItem = new FeatureContainersItem();
			featureContainersItem.setImage(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.FeatureStatus.FeatureContainers["+ i +"].Image"));
			featureContainersItem.setName(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.FeatureStatus.FeatureContainers["+ i +"].Name"));

			List<String> args = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEnvironmentFeatureResponse.Data.FeatureStatus.FeatureContainers["+ i +"].Args.Length"); j++) {
				args.add(_ctx.stringValue("DescribeEnvironmentFeatureResponse.Data.FeatureStatus.FeatureContainers["+ i +"].Args["+ j +"]"));
			}
			featureContainersItem.setArgs(args);

			featureContainers.add(featureContainersItem);
		}
		featureStatus.setFeatureContainers(featureContainers);
		data.setFeatureStatus(featureStatus);
		describeEnvironmentFeatureResponse.setData(data);
	 
	 	return describeEnvironmentFeatureResponse;
	}
}
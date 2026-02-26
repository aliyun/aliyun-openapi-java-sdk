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

import com.aliyuncs.arms.model.v20190808.ListEnvironmentsResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentsResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentsResponse.Data.EnvironmentsItem;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentsResponse.Data.EnvironmentsItem.AddonsItem;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentsResponse.Data.EnvironmentsItem.FeaturesItem;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentsResponse.Data.EnvironmentsItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentsResponseUnmarshaller {

	public static ListEnvironmentsResponse unmarshall(ListEnvironmentsResponse listEnvironmentsResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentsResponse.setRequestId(_ctx.stringValue("ListEnvironmentsResponse.RequestId"));
		listEnvironmentsResponse.setSuccess(_ctx.booleanValue("ListEnvironmentsResponse.Success"));
		listEnvironmentsResponse.setCode(_ctx.integerValue("ListEnvironmentsResponse.Code"));
		listEnvironmentsResponse.setMessage(_ctx.stringValue("ListEnvironmentsResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListEnvironmentsResponse.Data.Total"));

		List<EnvironmentsItem> environments = new ArrayList<EnvironmentsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentsResponse.Data.Environments.Length"); i++) {
			EnvironmentsItem environmentsItem = new EnvironmentsItem();
			environmentsItem.setUserId(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].UserId"));
			environmentsItem.setBindResourceId(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].BindResourceId"));
			environmentsItem.setBindResourceProfile(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].BindResourceProfile"));
			environmentsItem.setBindResourceType(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].BindResourceType"));
			environmentsItem.setBindVpcCidr(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].BindVpcCidr"));
			environmentsItem.setCreateTime(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].CreateTime"));
			environmentsItem.setCreatedUserId(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].CreatedUserId"));
			environmentsItem.setEnvironmentId(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].EnvironmentId"));
			environmentsItem.setEnvironmentName(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].EnvironmentName"));
			environmentsItem.setEnvironmentType(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].EnvironmentType"));
			environmentsItem.setGrafanaFolderTitle(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].GrafanaFolderTitle"));
			environmentsItem.setGrafanaFolderUid(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].GrafanaFolderUid"));
			environmentsItem.setPrometheusId(_ctx.longValue("ListEnvironmentsResponse.Data.Environments["+ i +"].PrometheusId"));
			environmentsItem.setPrometheusInstanceId(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].PrometheusInstanceId"));
			environmentsItem.setRegionId(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].RegionId"));
			environmentsItem.setResourceGroupId(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].ResourceGroupId"));
			environmentsItem.setGrafanaDatasourceUid(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].GrafanaDatasourceUid"));
			environmentsItem.setReleaseCount(_ctx.integerValue("ListEnvironmentsResponse.Data.Environments["+ i +"].ReleaseCount"));
			environmentsItem.setLatestReleaseCreateTime(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].LatestReleaseCreateTime"));
			environmentsItem.setManagedType(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].ManagedType"));
			environmentsItem.setFeePackage(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].FeePackage"));

			List<AddonsItem> addons = new ArrayList<AddonsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Addons.Length"); j++) {
				AddonsItem addonsItem = new AddonsItem();
				addonsItem.setAlias(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Addons["+ j +"].Alias"));
				addonsItem.setDescription(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Addons["+ j +"].Description"));
				addonsItem.setIcon(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Addons["+ j +"].Icon"));
				addonsItem.setName(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Addons["+ j +"].Name"));

				addons.add(addonsItem);
			}
			environmentsItem.setAddons(addons);

			List<FeaturesItem> features = new ArrayList<FeaturesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Features.Length"); j++) {
				FeaturesItem featuresItem = new FeaturesItem();
				featuresItem.setAlias(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Features["+ j +"].Alias"));
				featuresItem.setDescription(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Features["+ j +"].Description"));
				featuresItem.setIcon(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Features["+ j +"].Icon"));
				featuresItem.setName(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Features["+ j +"].Name"));

				features.add(featuresItem);
			}
			environmentsItem.setFeatures(features);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListEnvironmentsResponse.Data.Environments["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			environmentsItem.setTags(tags);

			environments.add(environmentsItem);
		}
		data.setEnvironments(environments);
		listEnvironmentsResponse.setData(data);
	 
	 	return listEnvironmentsResponse;
	}
}
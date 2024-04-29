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

import com.aliyuncs.arms.model.v20190808.DescribeEnvironmentResponse;
import com.aliyuncs.arms.model.v20190808.DescribeEnvironmentResponse.Data;
import com.aliyuncs.arms.model.v20190808.DescribeEnvironmentResponse.Data.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnvironmentResponseUnmarshaller {

	public static DescribeEnvironmentResponse unmarshall(DescribeEnvironmentResponse describeEnvironmentResponse, UnmarshallerContext _ctx) {
		
		describeEnvironmentResponse.setRequestId(_ctx.stringValue("DescribeEnvironmentResponse.RequestId"));
		describeEnvironmentResponse.setCode(_ctx.integerValue("DescribeEnvironmentResponse.Code"));
		describeEnvironmentResponse.setMessage(_ctx.stringValue("DescribeEnvironmentResponse.Message"));

		Data data = new Data();
		data.setEnvironmentId(_ctx.stringValue("DescribeEnvironmentResponse.Data.EnvironmentId"));
		data.setEnvironmentType(_ctx.stringValue("DescribeEnvironmentResponse.Data.EnvironmentType"));
		data.setEnvironmentName(_ctx.stringValue("DescribeEnvironmentResponse.Data.EnvironmentName"));
		data.setEnvironmentSubType(_ctx.stringValue("DescribeEnvironmentResponse.Data.EnvironmentSubType"));
		data.setRegionId(_ctx.stringValue("DescribeEnvironmentResponse.Data.RegionId"));
		data.setUserId(_ctx.stringValue("DescribeEnvironmentResponse.Data.UserId"));
		data.setBindResourceId(_ctx.stringValue("DescribeEnvironmentResponse.Data.BindResourceId"));
		data.setBindResourceType(_ctx.stringValue("DescribeEnvironmentResponse.Data.BindResourceType"));
		data.setBindResourceStatus(_ctx.stringValue("DescribeEnvironmentResponse.Data.BindResourceStatus"));
		data.setBindResourceProfile(_ctx.stringValue("DescribeEnvironmentResponse.Data.BindResourceProfile"));
		data.setBindVpcCidr(_ctx.stringValue("DescribeEnvironmentResponse.Data.BindVpcCidr"));
		data.setPrometheusInstanceId(_ctx.stringValue("DescribeEnvironmentResponse.Data.PrometheusInstanceId"));
		data.setPrometheusInstanceName(_ctx.stringValue("DescribeEnvironmentResponse.Data.PrometheusInstanceName"));
		data.setGrafanaFolderUid(_ctx.stringValue("DescribeEnvironmentResponse.Data.GrafanaFolderUid"));
		data.setGrafanaDatasourceUid(_ctx.stringValue("DescribeEnvironmentResponse.Data.GrafanaDatasourceUid"));
		data.setVpcId(_ctx.stringValue("DescribeEnvironmentResponse.Data.VpcId"));
		data.setGrafanaFolderUrl(_ctx.stringValue("DescribeEnvironmentResponse.Data.GrafanaFolderUrl"));
		data.setBindResourceStoreDuration(_ctx.stringValue("DescribeEnvironmentResponse.Data.BindResourceStoreDuration"));
		data.setGrafaDataSourceName(_ctx.stringValue("DescribeEnvironmentResponse.Data.GrafaDataSourceName"));
		data.setGrafanaFolderTitle(_ctx.stringValue("DescribeEnvironmentResponse.Data.GrafanaFolderTitle"));
		data.setManagedType(_ctx.stringValue("DescribeEnvironmentResponse.Data.ManagedType"));
		data.setFeePackage(_ctx.stringValue("DescribeEnvironmentResponse.Data.FeePackage"));
		data.setDbInstanceStatus(_ctx.stringValue("DescribeEnvironmentResponse.Data.DbInstanceStatus"));
		data.setResourceGroupId(_ctx.stringValue("DescribeEnvironmentResponse.Data.ResourceGroupId"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnvironmentResponse.Data.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeEnvironmentResponse.Data.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("DescribeEnvironmentResponse.Data.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		data.setTags(tags);
		describeEnvironmentResponse.setData(data);
	 
	 	return describeEnvironmentResponse;
	}
}
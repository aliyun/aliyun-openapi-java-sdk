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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetGrayEnvironmentsResponse;
import com.aliyuncs.edas.model.v20170801.GetGrayEnvironmentsResponse.EnvList;
import com.aliyuncs.edas.model.v20170801.GetGrayEnvironmentsResponse.EnvList.Metadata;
import com.aliyuncs.edas.model.v20170801.GetGrayEnvironmentsResponse.EnvList.Spec;
import com.aliyuncs.edas.model.v20170801.GetGrayEnvironmentsResponse.EnvList.Spec.ScopesItem;
import com.aliyuncs.edas.model.v20170801.GetGrayEnvironmentsResponse.EnvList.Spec.ScopesItem.ValueFrom;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGrayEnvironmentsResponseUnmarshaller {

	public static GetGrayEnvironmentsResponse unmarshall(GetGrayEnvironmentsResponse getGrayEnvironmentsResponse, UnmarshallerContext _ctx) {
		
		getGrayEnvironmentsResponse.setRequestId(_ctx.stringValue("GetGrayEnvironmentsResponse.RequestId"));
		getGrayEnvironmentsResponse.setCode(_ctx.integerValue("GetGrayEnvironmentsResponse.Code"));
		getGrayEnvironmentsResponse.setMessage(_ctx.stringValue("GetGrayEnvironmentsResponse.Message"));

		List<EnvList> data = new ArrayList<EnvList>();
		for (int i = 0; i < _ctx.lengthValue("GetGrayEnvironmentsResponse.Data.Length"); i++) {
			EnvList envList = new EnvList();
			envList.setAccountId(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].AccountId"));
			envList.setPointcutId(_ctx.longValue("GetGrayEnvironmentsResponse.Data["+ i +"].PointcutId"));
			envList.setRegionId(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].RegionId"));
			envList.setTenantId(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].TenantId"));

			Metadata metadata = new Metadata();
			metadata.setLabels(_ctx.mapValue("GetGrayEnvironmentsResponse.Data["+ i +"].Metadata.Labels"));
			metadata.setAnnotations(_ctx.mapValue("GetGrayEnvironmentsResponse.Data["+ i +"].Metadata.Annotations"));
			metadata.setName(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Metadata.Name"));
			metadata.setNamespace(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Metadata.Namespace"));
			envList.setMetadata(metadata);

			Spec spec = new Spec();
			spec.setEnable(_ctx.booleanValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Enable"));
			spec.setShowName(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.ShowName"));
			spec.setSingle(_ctx.booleanValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Single"));
			spec.setTag(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Tag"));
			spec.setSelector(_ctx.mapValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Selector"));

			List<ScopesItem> scopes = new ArrayList<ScopesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Scopes.Length"); j++) {
				ScopesItem scopesItem = new ScopesItem();
				scopesItem.setId(_ctx.longValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Scopes["+ j +"].Id"));
				scopesItem.setKey(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Scopes["+ j +"].Key"));
				scopesItem.setValue(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Scopes["+ j +"].Value"));
				scopesItem.setExtra(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Scopes["+ j +"].Extra"));

				ValueFrom valueFrom = new ValueFrom();
				valueFrom.setRefName(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Scopes["+ j +"].ValueFrom.RefName"));
				valueFrom.setRefValue(_ctx.stringValue("GetGrayEnvironmentsResponse.Data["+ i +"].Spec.Scopes["+ j +"].ValueFrom.RefValue"));
				scopesItem.setValueFrom(valueFrom);

				scopes.add(scopesItem);
			}
			spec.setScopes(scopes);
			envList.setSpec(spec);

			data.add(envList);
		}
		getGrayEnvironmentsResponse.setData(data);
	 
	 	return getGrayEnvironmentsResponse;
	}
}
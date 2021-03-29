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

import com.aliyuncs.edas.model.v20170801.ToggleGrayIngressResponse;
import com.aliyuncs.edas.model.v20170801.ToggleGrayIngressResponse.Data;
import com.aliyuncs.edas.model.v20170801.ToggleGrayIngressResponse.Data.Spec;
import com.aliyuncs.edas.model.v20170801.ToggleGrayIngressResponse.Data.Spec.ScopesItem;
import com.aliyuncs.edas.model.v20170801.ToggleGrayIngressResponse.Data.Spec.ScopesItem.ValueFrom;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ToggleGrayIngressResponseUnmarshaller {

	public static ToggleGrayIngressResponse unmarshall(ToggleGrayIngressResponse toggleGrayIngressResponse, UnmarshallerContext _ctx) {
		
		toggleGrayIngressResponse.setRequestId(_ctx.stringValue("ToggleGrayIngressResponse.RequestId"));
		toggleGrayIngressResponse.setCode(_ctx.integerValue("ToggleGrayIngressResponse.Code"));
		toggleGrayIngressResponse.setMessage(_ctx.integerValue("ToggleGrayIngressResponse.Message"));

		Data data = new Data();
		data.setPointcutId(_ctx.longValue("ToggleGrayIngressResponse.Data.PointcutId"));
		data.setRegionId(_ctx.stringValue("ToggleGrayIngressResponse.Data.RegionId"));

		Spec spec = new Spec();
		spec.setShowName(_ctx.stringValue("ToggleGrayIngressResponse.Data.Spec.ShowName"));
		spec.setTag(_ctx.stringValue("ToggleGrayIngressResponse.Data.Spec.Tag"));
		spec.setEnable(_ctx.booleanValue("ToggleGrayIngressResponse.Data.Spec.Enable"));
		spec.setSelector(_ctx.mapValue("ToggleGrayIngressResponse.Data.Spec.Selector"));

		List<ScopesItem> scopes = new ArrayList<ScopesItem>();
		for (int i = 0; i < _ctx.lengthValue("ToggleGrayIngressResponse.Data.Spec.Scopes.Length"); i++) {
			ScopesItem scopesItem = new ScopesItem();
			scopesItem.setId(_ctx.longValue("ToggleGrayIngressResponse.Data.Spec.Scopes["+ i +"].Id"));
			scopesItem.setKey(_ctx.stringValue("ToggleGrayIngressResponse.Data.Spec.Scopes["+ i +"].Key"));
			scopesItem.setValue(_ctx.stringValue("ToggleGrayIngressResponse.Data.Spec.Scopes["+ i +"].Value"));

			ValueFrom valueFrom = new ValueFrom();
			valueFrom.setRefName(_ctx.stringValue("ToggleGrayIngressResponse.Data.Spec.Scopes["+ i +"].ValueFrom.RefName"));
			valueFrom.setRefValue(_ctx.stringValue("ToggleGrayIngressResponse.Data.Spec.Scopes["+ i +"].ValueFrom.RefValue"));
			scopesItem.setValueFrom(valueFrom);

			scopes.add(scopesItem);
		}
		spec.setScopes(scopes);
		data.setSpec(spec);
		toggleGrayIngressResponse.setData(data);
	 
	 	return toggleGrayIngressResponse;
	}
}
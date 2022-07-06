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

import com.aliyuncs.airec.model.v20201126.ModifyFeatureTableResponse;
import com.aliyuncs.airec.model.v20201126.ModifyFeatureTableResponse.Result;
import com.aliyuncs.airec.model.v20201126.ModifyFeatureTableResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.ModifyFeatureTableResponse.Result.Meta.FeatureListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyFeatureTableResponseUnmarshaller {

	public static ModifyFeatureTableResponse unmarshall(ModifyFeatureTableResponse modifyFeatureTableResponse, UnmarshallerContext _ctx) {
		
		modifyFeatureTableResponse.setRequestId(_ctx.stringValue("ModifyFeatureTableResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("ModifyFeatureTableResponse.result.Status"));
		result.setFeatureTableId(_ctx.stringValue("ModifyFeatureTableResponse.result.FeatureTableId"));
		result.setType(_ctx.stringValue("ModifyFeatureTableResponse.result.Type"));
		result.setGmtCreate(_ctx.stringValue("ModifyFeatureTableResponse.result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyFeatureTableResponse.result.GmtModified"));

		Meta meta = new Meta();
		meta.setDataSourceId(_ctx.stringValue("ModifyFeatureTableResponse.result.Meta.DataSourceId"));
		meta.setInternal(_ctx.booleanValue("ModifyFeatureTableResponse.result.Meta.Internal"));
		meta.setMetaType(_ctx.stringValue("ModifyFeatureTableResponse.result.Meta.MetaType"));
		meta.setSource(_ctx.stringValue("ModifyFeatureTableResponse.result.Meta.Source"));
		meta.setUpdateFrequency(_ctx.longValue("ModifyFeatureTableResponse.result.Meta.UpdateFrequency"));

		List<FeatureListItem> featureList = new ArrayList<FeatureListItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyFeatureTableResponse.result.Meta.FeatureList.Length"); i++) {
			FeatureListItem featureListItem = new FeatureListItem();
			featureListItem.setComment(_ctx.stringValue("ModifyFeatureTableResponse.result.Meta.FeatureList["+ i +"].Comment"));
			featureListItem.setFeatureName(_ctx.stringValue("ModifyFeatureTableResponse.result.Meta.FeatureList["+ i +"].FeatureName"));
			featureListItem.setFieldName(_ctx.stringValue("ModifyFeatureTableResponse.result.Meta.FeatureList["+ i +"].FieldName"));
			featureListItem.setStatus(_ctx.stringValue("ModifyFeatureTableResponse.result.Meta.FeatureList["+ i +"].Status"));

			featureList.add(featureListItem);
		}
		meta.setFeatureList(featureList);
		result.setMeta(meta);
		modifyFeatureTableResponse.setResult(result);
	 
	 	return modifyFeatureTableResponse;
	}
}
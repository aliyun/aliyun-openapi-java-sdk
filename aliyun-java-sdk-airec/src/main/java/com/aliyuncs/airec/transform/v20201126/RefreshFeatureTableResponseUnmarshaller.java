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

import com.aliyuncs.airec.model.v20201126.RefreshFeatureTableResponse;
import com.aliyuncs.airec.model.v20201126.RefreshFeatureTableResponse.Result;
import com.aliyuncs.airec.model.v20201126.RefreshFeatureTableResponse.Result.Meta;
import com.aliyuncs.airec.model.v20201126.RefreshFeatureTableResponse.Result.Meta.FeatureListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshFeatureTableResponseUnmarshaller {

	public static RefreshFeatureTableResponse unmarshall(RefreshFeatureTableResponse refreshFeatureTableResponse, UnmarshallerContext _ctx) {
		
		refreshFeatureTableResponse.setRequestId(_ctx.stringValue("RefreshFeatureTableResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("RefreshFeatureTableResponse.result.Status"));
		result.setFeatureTableId(_ctx.stringValue("RefreshFeatureTableResponse.result.FeatureTableId"));
		result.setType(_ctx.stringValue("RefreshFeatureTableResponse.result.Type"));
		result.setGmtCreate(_ctx.stringValue("RefreshFeatureTableResponse.result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("RefreshFeatureTableResponse.result.GmtModified"));

		Meta meta = new Meta();
		meta.setDataSourceId(_ctx.stringValue("RefreshFeatureTableResponse.result.Meta.DataSourceId"));
		meta.setInternal(_ctx.booleanValue("RefreshFeatureTableResponse.result.Meta.Internal"));
		meta.setMetaType(_ctx.stringValue("RefreshFeatureTableResponse.result.Meta.MetaType"));
		meta.setSource(_ctx.stringValue("RefreshFeatureTableResponse.result.Meta.Source"));
		meta.setUpdateFrequency(_ctx.longValue("RefreshFeatureTableResponse.result.Meta.UpdateFrequency"));

		List<FeatureListItem> featureList = new ArrayList<FeatureListItem>();
		for (int i = 0; i < _ctx.lengthValue("RefreshFeatureTableResponse.result.Meta.FeatureList.Length"); i++) {
			FeatureListItem featureListItem = new FeatureListItem();
			featureListItem.setComment(_ctx.stringValue("RefreshFeatureTableResponse.result.Meta.FeatureList["+ i +"].Comment"));
			featureListItem.setFeatureName(_ctx.stringValue("RefreshFeatureTableResponse.result.Meta.FeatureList["+ i +"].FeatureName"));
			featureListItem.setFieldName(_ctx.stringValue("RefreshFeatureTableResponse.result.Meta.FeatureList["+ i +"].FieldName"));
			featureListItem.setStatus(_ctx.stringValue("RefreshFeatureTableResponse.result.Meta.FeatureList["+ i +"].Status"));

			featureList.add(featureListItem);
		}
		meta.setFeatureList(featureList);
		result.setMeta(meta);
		refreshFeatureTableResponse.setResult(result);
	 
	 	return refreshFeatureTableResponse;
	}
}
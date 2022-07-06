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

import com.aliyuncs.airec.model.v20201126.ListFeatureTablesResponse;
import com.aliyuncs.airec.model.v20201126.ListFeatureTablesResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListFeatureTablesResponse.ResultItem.Meta;
import com.aliyuncs.airec.model.v20201126.ListFeatureTablesResponse.ResultItem.Meta.FeatureListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFeatureTablesResponseUnmarshaller {

	public static ListFeatureTablesResponse unmarshall(ListFeatureTablesResponse listFeatureTablesResponse, UnmarshallerContext _ctx) {
		
		listFeatureTablesResponse.setRequestId(_ctx.stringValue("ListFeatureTablesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFeatureTablesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setStatus(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Status"));
			resultItem.setFeatureTableId(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].FeatureTableId"));
			resultItem.setType(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Type"));
			resultItem.setGmtCreate(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].GmtModified"));

			Meta meta = new Meta();
			meta.setDataSourceId(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Meta.DataSourceId"));
			meta.setInternal(_ctx.booleanValue("ListFeatureTablesResponse.result["+ i +"].Meta.Internal"));
			meta.setMetaType(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Meta.MetaType"));
			meta.setSource(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Meta.Source"));
			meta.setUpdateFrequency(_ctx.longValue("ListFeatureTablesResponse.result["+ i +"].Meta.UpdateFrequency"));

			List<FeatureListItem> featureList = new ArrayList<FeatureListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFeatureTablesResponse.result["+ i +"].Meta.FeatureList.Length"); j++) {
				FeatureListItem featureListItem = new FeatureListItem();
				featureListItem.setComment(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Meta.FeatureList["+ j +"].Comment"));
				featureListItem.setFeatureName(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Meta.FeatureList["+ j +"].FeatureName"));
				featureListItem.setFieldName(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Meta.FeatureList["+ j +"].FieldName"));
				featureListItem.setStatus(_ctx.stringValue("ListFeatureTablesResponse.result["+ i +"].Meta.FeatureList["+ j +"].Status"));

				featureList.add(featureListItem);
			}
			meta.setFeatureList(featureList);
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		listFeatureTablesResponse.setResult(result);
	 
	 	return listFeatureTablesResponse;
	}
}
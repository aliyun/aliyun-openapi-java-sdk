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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.AnalyzeSQLLineageResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.AnalyzeSQLLineageResponse.LineageResult;
import com.aliyuncs.dms_enterprise.model.v20181101.AnalyzeSQLLineageResponse.LineageResult.LineageItem;
import com.aliyuncs.dms_enterprise.model.v20181101.AnalyzeSQLLineageResponse.LineageResult.LineageItem.ProcessDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.AnalyzeSQLLineageResponse.LineageResult.ObjectMetadataItem;
import com.aliyuncs.dms_enterprise.model.v20181101.AnalyzeSQLLineageResponse.LineageResult.ObjectMetadataItem.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class AnalyzeSQLLineageResponseUnmarshaller {

	public static AnalyzeSQLLineageResponse unmarshall(AnalyzeSQLLineageResponse analyzeSQLLineageResponse, UnmarshallerContext _ctx) {
		
		analyzeSQLLineageResponse.setRequestId(_ctx.stringValue("AnalyzeSQLLineageResponse.RequestId"));
		analyzeSQLLineageResponse.setSuccess(_ctx.booleanValue("AnalyzeSQLLineageResponse.Success"));
		analyzeSQLLineageResponse.setErrorMessage(_ctx.stringValue("AnalyzeSQLLineageResponse.ErrorMessage"));
		analyzeSQLLineageResponse.setErrorCode(_ctx.stringValue("AnalyzeSQLLineageResponse.ErrorCode"));

		LineageResult lineageResult = new LineageResult();

		List<LineageItem> lineages = new ArrayList<LineageItem>();
		for (int i = 0; i < _ctx.lengthValue("AnalyzeSQLLineageResponse.LineageResult.Lineages.Length"); i++) {
			LineageItem lineageItem = new LineageItem();
			lineageItem.setLineageType(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.Lineages["+ i +"].LineageType"));
			lineageItem.setSrc(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.Lineages["+ i +"].Src"));
			lineageItem.setDst(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.Lineages["+ i +"].Dst"));
			lineageItem.setOperType(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.Lineages["+ i +"].OperType"));

			ProcessDetail processDetail = new ProcessDetail();
			processDetail.setCode(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.Lineages["+ i +"].ProcessDetail.Code"));
			processDetail.setCalWay(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.Lineages["+ i +"].ProcessDetail.CalWay"));
			lineageItem.setProcessDetail(processDetail);

			lineages.add(lineageItem);
		}
		lineageResult.setLineages(lineages);

		List<ObjectMetadataItem> objectMetadata = new ArrayList<ObjectMetadataItem>();
		for (int i = 0; i < _ctx.lengthValue("AnalyzeSQLLineageResponse.LineageResult.ObjectMetadata.Length"); i++) {
			ObjectMetadataItem objectMetadataItem = new ObjectMetadataItem();
			objectMetadataItem.setName(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.ObjectMetadata["+ i +"].Name"));
			objectMetadataItem.setType(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.ObjectMetadata["+ i +"].Type"));
			objectMetadataItem.setSource(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.ObjectMetadata["+ i +"].Source"));

			List<Field> fields = new ArrayList<Field>();
			for (int j = 0; j < _ctx.lengthValue("AnalyzeSQLLineageResponse.LineageResult.ObjectMetadata["+ i +"].Fields.Length"); j++) {
				Field field = new Field();
				field.setName(_ctx.stringValue("AnalyzeSQLLineageResponse.LineageResult.ObjectMetadata["+ i +"].Fields["+ j +"].Name"));

				fields.add(field);
			}
			objectMetadataItem.setFields(fields);

			objectMetadata.add(objectMetadataItem);
		}
		lineageResult.setObjectMetadata(objectMetadata);
		analyzeSQLLineageResponse.setLineageResult(lineageResult);
	 
	 	return analyzeSQLLineageResponse;
	}
}
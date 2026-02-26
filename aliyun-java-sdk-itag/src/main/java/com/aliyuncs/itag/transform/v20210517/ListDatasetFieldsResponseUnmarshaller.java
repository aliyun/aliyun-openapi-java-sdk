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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.ListDatasetFieldsResponse;
import com.aliyuncs.itag.model.v20210517.ListDatasetFieldsResponse.ITagDatasetField;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasetFieldsResponseUnmarshaller {

	public static ListDatasetFieldsResponse unmarshall(ListDatasetFieldsResponse listDatasetFieldsResponse, UnmarshallerContext _ctx) {
		
		listDatasetFieldsResponse.setRequestId(_ctx.stringValue("ListDatasetFieldsResponse.RequestId"));
		listDatasetFieldsResponse.setCode(_ctx.stringValue("ListDatasetFieldsResponse.Code"));
		listDatasetFieldsResponse.setErrInfo(_ctx.stringValue("ListDatasetFieldsResponse.ErrInfo"));
		listDatasetFieldsResponse.setMsg(_ctx.stringValue("ListDatasetFieldsResponse.Msg"));
		listDatasetFieldsResponse.setSucc(_ctx.booleanValue("ListDatasetFieldsResponse.Succ"));
		listDatasetFieldsResponse.setErrorCode(_ctx.stringValue("ListDatasetFieldsResponse.ErrorCode"));

		List<ITagDatasetField> result = new ArrayList<ITagDatasetField>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasetFieldsResponse.Result.Length"); i++) {
			ITagDatasetField iTagDatasetField = new ITagDatasetField();
			iTagDatasetField.setFieldName(_ctx.stringValue("ListDatasetFieldsResponse.Result["+ i +"].FieldName"));
			iTagDatasetField.setType(_ctx.stringValue("ListDatasetFieldsResponse.Result["+ i +"].Type"));
			iTagDatasetField.setSensitive(_ctx.booleanValue("ListDatasetFieldsResponse.Result["+ i +"].Sensitive"));
			iTagDatasetField.setClassify(_ctx.stringValue("ListDatasetFieldsResponse.Result["+ i +"].Classify"));
			iTagDatasetField.setExif(_ctx.mapValue("ListDatasetFieldsResponse.Result["+ i +"].Exif"));
			iTagDatasetField.setSortKey(_ctx.booleanValue("ListDatasetFieldsResponse.Result["+ i +"].sortKey"));
			iTagDatasetField.setFieldDesc(_ctx.stringValue("ListDatasetFieldsResponse.Result["+ i +"].FieldDesc"));
			iTagDatasetField.setFieldClassify(_ctx.stringValue("ListDatasetFieldsResponse.Result["+ i +"].FieldClassify"));
			iTagDatasetField.setAlias(_ctx.mapValue("ListDatasetFieldsResponse.Result["+ i +"].Alias"));
			iTagDatasetField.setFieldType(_ctx.stringValue("ListDatasetFieldsResponse.Result["+ i +"].FieldType"));

			result.add(iTagDatasetField);
		}
		listDatasetFieldsResponse.setResult(result);
	 
	 	return listDatasetFieldsResponse;
	}
}
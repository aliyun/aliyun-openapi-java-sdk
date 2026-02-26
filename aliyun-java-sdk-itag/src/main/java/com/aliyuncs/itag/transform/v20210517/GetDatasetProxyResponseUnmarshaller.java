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

import com.aliyuncs.itag.model.v20210517.GetDatasetProxyResponse;
import com.aliyuncs.itag.model.v20210517.GetDatasetProxyResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetDatasetProxyResponse.Result.Creator;
import com.aliyuncs.itag.model.v20210517.GetDatasetProxyResponse.Result.Modifier;
import com.aliyuncs.itag.model.v20210517.GetDatasetProxyResponse.Result.Schema;
import com.aliyuncs.itag.model.v20210517.GetDatasetProxyResponse.Result.Schema.ITagDatasetField;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatasetProxyResponseUnmarshaller {

	public static GetDatasetProxyResponse unmarshall(GetDatasetProxyResponse getDatasetProxyResponse, UnmarshallerContext _ctx) {
		
		getDatasetProxyResponse.setRequestId(_ctx.stringValue("GetDatasetProxyResponse.RequestId"));
		getDatasetProxyResponse.setCode(_ctx.stringValue("GetDatasetProxyResponse.Code"));
		getDatasetProxyResponse.setErrInfo(_ctx.stringValue("GetDatasetProxyResponse.ErrInfo"));
		getDatasetProxyResponse.setMsg(_ctx.stringValue("GetDatasetProxyResponse.Msg"));
		getDatasetProxyResponse.setSucc(_ctx.booleanValue("GetDatasetProxyResponse.Succ"));
		getDatasetProxyResponse.setErrorCode(_ctx.stringValue("GetDatasetProxyResponse.ErrorCode"));

		Result result = new Result();
		result.setId(_ctx.stringValue("GetDatasetProxyResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetDatasetProxyResponse.Result.Name"));
		result.setDescription(_ctx.stringValue("GetDatasetProxyResponse.Result.Description"));
		result.setSource(_ctx.stringValue("GetDatasetProxyResponse.Result.Source"));
		result.setSourceBizId(_ctx.stringValue("GetDatasetProxyResponse.Result.SourceBizId"));
		result.setProxyTarget(_ctx.stringValue("GetDatasetProxyResponse.Result.ProxyTarget"));
		result.setProxyConfigs(_ctx.mapValue("GetDatasetProxyResponse.Result.ProxyConfigs"));
		result.setSafetyLevel(_ctx.integerValue("GetDatasetProxyResponse.Result.SafetyLevel"));
		result.setSharedMode(_ctx.stringValue("GetDatasetProxyResponse.Result.SharedMode"));
		result.setTotalNum(_ctx.longValue("GetDatasetProxyResponse.Result.TotalNum"));
		result.setTntInstId(_ctx.stringValue("GetDatasetProxyResponse.Result.TntInstId"));
		result.setStatus(_ctx.integerValue("GetDatasetProxyResponse.Result.Status"));
		result.setRunMsg(_ctx.stringValue("GetDatasetProxyResponse.Result.RunMsg"));
		result.setGmtCreate(_ctx.stringValue("GetDatasetProxyResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("GetDatasetProxyResponse.Result.GmtModified"));
		result.setSortKey(_ctx.stringValue("GetDatasetProxyResponse.Result.SortKey"));

		List<String> fieldTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDatasetProxyResponse.Result.FieldTypes.Length"); i++) {
			fieldTypes.add(_ctx.stringValue("GetDatasetProxyResponse.Result.FieldTypes["+ i +"]"));
		}
		result.setFieldTypes(fieldTypes);

		Schema schema = new Schema();

		List<ITagDatasetField> fields = new ArrayList<ITagDatasetField>();
		for (int i = 0; i < _ctx.lengthValue("GetDatasetProxyResponse.Result.Schema.Fields.Length"); i++) {
			ITagDatasetField iTagDatasetField = new ITagDatasetField();
			iTagDatasetField.setFieldName(_ctx.stringValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].FieldName"));
			iTagDatasetField.setType(_ctx.stringValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].Type"));
			iTagDatasetField.setSensitive(_ctx.booleanValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].Sensitive"));
			iTagDatasetField.setClassify(_ctx.stringValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].Classify"));
			iTagDatasetField.setExif(_ctx.mapValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].Exif"));
			iTagDatasetField.setSortKey(_ctx.booleanValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].sortKey"));
			iTagDatasetField.setFieldDesc(_ctx.stringValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].FieldDesc"));
			iTagDatasetField.setFieldClassify(_ctx.stringValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].FieldClassify"));
			iTagDatasetField.setAlias(_ctx.mapValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].Alias"));
			iTagDatasetField.setFieldType(_ctx.stringValue("GetDatasetProxyResponse.Result.Schema.Fields["+ i +"].FieldType"));

			fields.add(iTagDatasetField);
		}
		schema.setFields(fields);
		result.setSchema(schema);

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("GetDatasetProxyResponse.Result.Creator.UserId"));
		creator.setUserName(_ctx.stringValue("GetDatasetProxyResponse.Result.Creator.UserName"));
		creator.setAccountType(_ctx.stringValue("GetDatasetProxyResponse.Result.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetDatasetProxyResponse.Result.Creator.AccountNo"));
		result.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.stringValue("GetDatasetProxyResponse.Result.Modifier.UserId"));
		modifier.setUserName(_ctx.stringValue("GetDatasetProxyResponse.Result.Modifier.UserName"));
		modifier.setAccountType(_ctx.stringValue("GetDatasetProxyResponse.Result.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetDatasetProxyResponse.Result.Modifier.AccountNo"));
		result.setModifier(modifier);
		getDatasetProxyResponse.setResult(result);
	 
	 	return getDatasetProxyResponse;
	}
}
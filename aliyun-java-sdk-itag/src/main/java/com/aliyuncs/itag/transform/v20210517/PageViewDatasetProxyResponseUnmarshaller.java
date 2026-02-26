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

import com.aliyuncs.itag.model.v20210517.PageViewDatasetProxyResponse;
import com.aliyuncs.itag.model.v20210517.PageViewDatasetProxyResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewDatasetProxyResponse.Result.ListItem;
import com.aliyuncs.itag.model.v20210517.PageViewDatasetProxyResponse.Result.ListItem.Creator;
import com.aliyuncs.itag.model.v20210517.PageViewDatasetProxyResponse.Result.ListItem.Modifier;
import com.aliyuncs.itag.model.v20210517.PageViewDatasetProxyResponse.Result.ListItem.Schema;
import com.aliyuncs.itag.model.v20210517.PageViewDatasetProxyResponse.Result.ListItem.Schema.FieldsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewDatasetProxyResponseUnmarshaller {

	public static PageViewDatasetProxyResponse unmarshall(PageViewDatasetProxyResponse pageViewDatasetProxyResponse, UnmarshallerContext _ctx) {
		
		pageViewDatasetProxyResponse.setRequestId(_ctx.stringValue("PageViewDatasetProxyResponse.RequestId"));
		pageViewDatasetProxyResponse.setCode(_ctx.stringValue("PageViewDatasetProxyResponse.Code"));
		pageViewDatasetProxyResponse.setErrInfo(_ctx.stringValue("PageViewDatasetProxyResponse.ErrInfo"));
		pageViewDatasetProxyResponse.setMsg(_ctx.stringValue("PageViewDatasetProxyResponse.Msg"));
		pageViewDatasetProxyResponse.setSucc(_ctx.booleanValue("PageViewDatasetProxyResponse.Succ"));
		pageViewDatasetProxyResponse.setErrorCode(_ctx.stringValue("PageViewDatasetProxyResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageViewDatasetProxyResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageViewDatasetProxyResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewDatasetProxyResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewDatasetProxyResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PageViewDatasetProxyResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setGmtCreate(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].GmtModified"));
			listItem.setName(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Name"));
			listItem.setDescription(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Description"));
			listItem.setSource(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Source"));
			listItem.setSourceBizId(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].SourceBizId"));
			listItem.setProxyTarget(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].ProxyTarget"));
			listItem.setProxyConfigs(_ctx.mapValue("PageViewDatasetProxyResponse.Result.List["+ i +"].ProxyConfigs"));
			listItem.setSafetyLevel(_ctx.longValue("PageViewDatasetProxyResponse.Result.List["+ i +"].SafetyLevel"));
			listItem.setSharedMode(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].sharedMode"));
			listItem.setTotalNum(_ctx.longValue("PageViewDatasetProxyResponse.Result.List["+ i +"].TotalNum"));
			listItem.setTntInstId(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].TntInstId"));
			listItem.setStatus(_ctx.longValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Status"));
			listItem.setRunMsg(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].RunMsg"));

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Creator.AccountNo"));
			listItem.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Modifier.UserId"));
			modifier.setUserName(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Modifier.UserName"));
			modifier.setAccountType(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Modifier.AccountNo"));
			listItem.setModifier(modifier);

			Schema schema = new Schema();

			List<FieldsItem> fields = new ArrayList<FieldsItem>();
			for (int j = 0; j < _ctx.lengthValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields.Length"); j++) {
				FieldsItem fieldsItem = new FieldsItem();
				fieldsItem.setFieldName(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].FieldName"));
				fieldsItem.setType(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].Type"));
				fieldsItem.setSensitive(_ctx.booleanValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].Sensitive"));
				fieldsItem.setClassify(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].Classify"));
				fieldsItem.setExif(_ctx.mapValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].Exif"));
				fieldsItem.setSortKey(_ctx.booleanValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].sortKey"));
				fieldsItem.setFieldDesc(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].FieldDesc"));
				fieldsItem.setFieldClassify(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].FieldClassify"));
				fieldsItem.setAlias(_ctx.mapValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].Alias"));
				fieldsItem.setFieldType(_ctx.stringValue("PageViewDatasetProxyResponse.Result.List["+ i +"].Schema.Fields["+ j +"].FieldType"));

				fields.add(fieldsItem);
			}
			schema.setFields(fields);
			listItem.setSchema(schema);

			list.add(listItem);
		}
		result.setList(list);
		pageViewDatasetProxyResponse.setResult(result);
	 
	 	return pageViewDatasetProxyResponse;
	}
}
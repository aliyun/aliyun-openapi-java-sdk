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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsParamsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsParamsResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsParamsResponseUnmarshaller {

	public static DescribeDrdsParamsResponse unmarshall(DescribeDrdsParamsResponse describeDrdsParamsResponse, UnmarshallerContext _ctx) {
		
		describeDrdsParamsResponse.setRequestId(_ctx.stringValue("DescribeDrdsParamsResponse.RequestId"));
		describeDrdsParamsResponse.setSuccess(_ctx.booleanValue("DescribeDrdsParamsResponse.Success"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsParamsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setParamName(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamName"));
			listItem.setParamEnglishName(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamEnglishName"));
			listItem.setParamVariableName(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamVariableName"));
			listItem.setParamDesc(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamDesc"));
			listItem.setParamValue(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamValue"));
			listItem.setDbName(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].DbName"));
			listItem.setParamDefaultValue(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamDefaultValue"));
			listItem.setParamRanges(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamRanges"));
			listItem.setParamLevel(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamLevel"));
			listItem.setParamType(_ctx.stringValue("DescribeDrdsParamsResponse.List["+ i +"].ParamType"));
			listItem.setNeedRestart(_ctx.booleanValue("DescribeDrdsParamsResponse.List["+ i +"].NeedRestart"));
			listItem.setUserVisible(_ctx.booleanValue("DescribeDrdsParamsResponse.List["+ i +"].UserVisible"));

			list.add(listItem);
		}
		describeDrdsParamsResponse.setList(list);
	 
	 	return describeDrdsParamsResponse;
	}
}
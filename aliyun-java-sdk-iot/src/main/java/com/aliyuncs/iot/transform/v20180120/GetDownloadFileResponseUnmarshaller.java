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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.GetDownloadFileResponse;
import com.aliyuncs.iot.model.v20180120.GetDownloadFileResponse.Data;
import com.aliyuncs.iot.model.v20180120.GetDownloadFileResponse.Data.HeaderItem;
import com.aliyuncs.iot.model.v20180120.GetDownloadFileResponse.Data.QuerySetting;
import com.aliyuncs.iot.model.v20180120.GetDownloadFileResponse.Data.QuerySetting.AstExprItem;
import com.aliyuncs.iot.model.v20180120.GetDownloadFileResponse.Data.QuerySetting.SelectedHeadersItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDownloadFileResponseUnmarshaller {

	public static GetDownloadFileResponse unmarshall(GetDownloadFileResponse getDownloadFileResponse, UnmarshallerContext _ctx) {
		
		getDownloadFileResponse.setRequestId(_ctx.stringValue("GetDownloadFileResponse.RequestId"));
		getDownloadFileResponse.setSuccess(_ctx.booleanValue("GetDownloadFileResponse.Success"));
		getDownloadFileResponse.setCode(_ctx.stringValue("GetDownloadFileResponse.Code"));
		getDownloadFileResponse.setErrorMessage(_ctx.stringValue("GetDownloadFileResponse.ErrorMessage"));

		Data data = new Data();
		data.setPreviewSize(_ctx.integerValue("GetDownloadFileResponse.Data.PreviewSize"));
		data.setCsvUrl(_ctx.stringValue("GetDownloadFileResponse.Data.CsvUrl"));
		data.setDatasetId(_ctx.stringValue("GetDownloadFileResponse.Data.DatasetId"));
		data.setLongJobId(_ctx.stringValue("GetDownloadFileResponse.Data.LongJobId"));
		data.setStatus(_ctx.integerValue("GetDownloadFileResponse.Data.Status"));
		data.setBeginTime(_ctx.longValue("GetDownloadFileResponse.Data.BeginTime"));
		data.setEndTime(_ctx.longValue("GetDownloadFileResponse.Data.EndTime"));
		data.setResultDataInString(_ctx.stringValue("GetDownloadFileResponse.Data.ResultDataInString"));
		data.setAsyncExecute(_ctx.booleanValue("GetDownloadFileResponse.Data.AsyncExecute"));
		data.setTotalCount(_ctx.longValue("GetDownloadFileResponse.Data.TotalCount"));
		data.setPageNo(_ctx.integerValue("GetDownloadFileResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetDownloadFileResponse.Data.PageSize"));
		data.setCsvUrl1(_ctx.stringValue("GetDownloadFileResponse.Data.CsvUrl"));
		data.setCsvFileName(_ctx.stringValue("GetDownloadFileResponse.Data.CsvFileName"));

		List<Map<Object, Object>> result = _ctx.listMapValue("GetDownloadFileResponse.Data.Result");
		data.setResult(result);

		QuerySetting querySetting = new QuerySetting();

		List<SelectedHeadersItem> selectedHeaders = new ArrayList<SelectedHeadersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDownloadFileResponse.Data.QuerySetting.SelectedHeaders.Length"); i++) {
			SelectedHeadersItem selectedHeadersItem = new SelectedHeadersItem();
			selectedHeadersItem.setFieldName(_ctx.stringValue("GetDownloadFileResponse.Data.QuerySetting.SelectedHeaders["+ i +"].FieldName"));
			selectedHeadersItem.setAlias(_ctx.stringValue("GetDownloadFileResponse.Data.QuerySetting.SelectedHeaders["+ i +"].Alias"));
			selectedHeadersItem.setFieldType(_ctx.stringValue("GetDownloadFileResponse.Data.QuerySetting.SelectedHeaders["+ i +"].FieldType"));
			selectedHeadersItem.setTimeClass(_ctx.stringValue("GetDownloadFileResponse.Data.QuerySetting.SelectedHeaders["+ i +"].TimeClass"));
			selectedHeadersItem.setGeoClass(_ctx.stringValue("GetDownloadFileResponse.Data.QuerySetting.SelectedHeaders["+ i +"].GeoClass"));
			selectedHeadersItem.setDimDateClass(_ctx.stringValue("GetDownloadFileResponse.Data.QuerySetting.SelectedHeaders["+ i +"].DimDateClass"));

			selectedHeaders.add(selectedHeadersItem);
		}
		querySetting.setSelectedHeaders(selectedHeaders);

		List<AstExprItem> astExpr = new ArrayList<AstExprItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDownloadFileResponse.Data.QuerySetting.AstExpr.Length"); i++) {
			AstExprItem astExprItem = new AstExprItem();
			astExprItem.setExpr(_ctx.stringValue("GetDownloadFileResponse.Data.QuerySetting.AstExpr["+ i +"].Expr"));
			astExprItem.setExprType(_ctx.stringValue("GetDownloadFileResponse.Data.QuerySetting.AstExpr["+ i +"].ExprType"));

			astExpr.add(astExprItem);
		}
		querySetting.setAstExpr(astExpr);
		data.setQuerySetting(querySetting);

		List<HeaderItem> header = new ArrayList<HeaderItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDownloadFileResponse.Data.Header.Length"); i++) {
			HeaderItem headerItem = new HeaderItem();
			headerItem.setFieldName(_ctx.stringValue("GetDownloadFileResponse.Data.Header["+ i +"].FieldName"));
			headerItem.setAlias(_ctx.stringValue("GetDownloadFileResponse.Data.Header["+ i +"].Alias"));
			headerItem.setFieldType(_ctx.stringValue("GetDownloadFileResponse.Data.Header["+ i +"].FieldType"));
			headerItem.setTypeClass(_ctx.stringValue("GetDownloadFileResponse.Data.Header["+ i +"].TypeClass"));
			headerItem.setTimeClass(_ctx.stringValue("GetDownloadFileResponse.Data.Header["+ i +"].TimeClass"));
			headerItem.setGeoClass(_ctx.stringValue("GetDownloadFileResponse.Data.Header["+ i +"].GeoClass"));
			headerItem.setDimDateClass(_ctx.stringValue("GetDownloadFileResponse.Data.Header["+ i +"].DimDateClass"));

			header.add(headerItem);
		}
		data.setHeader(header);
		getDownloadFileResponse.setData(data);
	 
	 	return getDownloadFileResponse;
	}
}
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

import com.aliyuncs.iot.model.v20180120.CreateDownloadDataJobResponse;
import com.aliyuncs.iot.model.v20180120.CreateDownloadDataJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.CreateDownloadDataJobResponse.Data.HeaderItem;
import com.aliyuncs.iot.model.v20180120.CreateDownloadDataJobResponse.Data.QuerySetting;
import com.aliyuncs.iot.model.v20180120.CreateDownloadDataJobResponse.Data.QuerySetting.AstExprItem;
import com.aliyuncs.iot.model.v20180120.CreateDownloadDataJobResponse.Data.QuerySetting.SelectedHeadersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDownloadDataJobResponseUnmarshaller {

	public static CreateDownloadDataJobResponse unmarshall(CreateDownloadDataJobResponse createDownloadDataJobResponse, UnmarshallerContext _ctx) {
		
		createDownloadDataJobResponse.setRequestId(_ctx.stringValue("CreateDownloadDataJobResponse.RequestId"));
		createDownloadDataJobResponse.setSuccess(_ctx.booleanValue("CreateDownloadDataJobResponse.Success"));
		createDownloadDataJobResponse.setCode(_ctx.stringValue("CreateDownloadDataJobResponse.Code"));
		createDownloadDataJobResponse.setErrorMessage(_ctx.stringValue("CreateDownloadDataJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setPreviewSize(_ctx.integerValue("CreateDownloadDataJobResponse.Data.PreviewSize"));
		data.setCsvUrl(_ctx.stringValue("CreateDownloadDataJobResponse.Data.CsvUrl"));
		data.setDatasetId(_ctx.stringValue("CreateDownloadDataJobResponse.Data.DatasetId"));
		data.setLongJobId(_ctx.stringValue("CreateDownloadDataJobResponse.Data.LongJobId"));
		data.setStatus(_ctx.integerValue("CreateDownloadDataJobResponse.Data.Status"));
		data.setBeginTime(_ctx.longValue("CreateDownloadDataJobResponse.Data.BeginTime"));
		data.setEndTime(_ctx.longValue("CreateDownloadDataJobResponse.Data.EndTime"));
		data.setResultDataInString(_ctx.stringValue("CreateDownloadDataJobResponse.Data.ResultDataInString"));
		data.setAsyncExecute(_ctx.booleanValue("CreateDownloadDataJobResponse.Data.AsyncExecute"));
		data.setTotalCount(_ctx.longValue("CreateDownloadDataJobResponse.Data.TotalCount"));
		data.setPageNo(_ctx.integerValue("CreateDownloadDataJobResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("CreateDownloadDataJobResponse.Data.PageSize"));
		data.setCsvFileName(_ctx.stringValue("CreateDownloadDataJobResponse.Data.CsvFileName"));

		QuerySetting querySetting = new QuerySetting();

		List<SelectedHeadersItem> selectedHeaders = new ArrayList<SelectedHeadersItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateDownloadDataJobResponse.Data.QuerySetting.SelectedHeaders.Length"); i++) {
			SelectedHeadersItem selectedHeadersItem = new SelectedHeadersItem();
			selectedHeadersItem.setFieldName(_ctx.stringValue("CreateDownloadDataJobResponse.Data.QuerySetting.SelectedHeaders["+ i +"].FieldName"));
			selectedHeadersItem.setAlias(_ctx.stringValue("CreateDownloadDataJobResponse.Data.QuerySetting.SelectedHeaders["+ i +"].Alias"));
			selectedHeadersItem.setFieldType(_ctx.stringValue("CreateDownloadDataJobResponse.Data.QuerySetting.SelectedHeaders["+ i +"].FieldType"));
			selectedHeadersItem.setTimeClass(_ctx.stringValue("CreateDownloadDataJobResponse.Data.QuerySetting.SelectedHeaders["+ i +"].TimeClass"));
			selectedHeadersItem.setGeoClass(_ctx.stringValue("CreateDownloadDataJobResponse.Data.QuerySetting.SelectedHeaders["+ i +"].GeoClass"));
			selectedHeadersItem.setDimDateClass(_ctx.stringValue("CreateDownloadDataJobResponse.Data.QuerySetting.SelectedHeaders["+ i +"].DimDateClass"));

			selectedHeaders.add(selectedHeadersItem);
		}
		querySetting.setSelectedHeaders(selectedHeaders);

		List<AstExprItem> astExpr = new ArrayList<AstExprItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateDownloadDataJobResponse.Data.QuerySetting.AstExpr.Length"); i++) {
			AstExprItem astExprItem = new AstExprItem();
			astExprItem.setExpr(_ctx.stringValue("CreateDownloadDataJobResponse.Data.QuerySetting.AstExpr["+ i +"].Expr"));
			astExprItem.setExprType(_ctx.stringValue("CreateDownloadDataJobResponse.Data.QuerySetting.AstExpr["+ i +"].ExprType"));

			astExpr.add(astExprItem);
		}
		querySetting.setAstExpr(astExpr);
		data.setQuerySetting(querySetting);

		List<HeaderItem> header = new ArrayList<HeaderItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateDownloadDataJobResponse.Data.Header.Length"); i++) {
			HeaderItem headerItem = new HeaderItem();
			headerItem.setFieldName(_ctx.stringValue("CreateDownloadDataJobResponse.Data.Header["+ i +"].FieldName"));
			headerItem.setAlias(_ctx.stringValue("CreateDownloadDataJobResponse.Data.Header["+ i +"].Alias"));
			headerItem.setFieldType(_ctx.stringValue("CreateDownloadDataJobResponse.Data.Header["+ i +"].FieldType"));
			headerItem.setTypeClass(_ctx.stringValue("CreateDownloadDataJobResponse.Data.Header["+ i +"].TypeClass"));
			headerItem.setTimeClass(_ctx.stringValue("CreateDownloadDataJobResponse.Data.Header["+ i +"].TimeClass"));
			headerItem.setGeoClass(_ctx.stringValue("CreateDownloadDataJobResponse.Data.Header["+ i +"].GeoClass"));
			headerItem.setDimDateClass(_ctx.stringValue("CreateDownloadDataJobResponse.Data.Header["+ i +"].DimDateClass"));
			headerItem.setDataPrecision(_ctx.stringValue("CreateDownloadDataJobResponse.Data.Header["+ i +"].DataPrecision"));

			header.add(headerItem);
		}
		data.setHeader(header);
		createDownloadDataJobResponse.setData(data);
	 
	 	return createDownloadDataJobResponse;
	}
}
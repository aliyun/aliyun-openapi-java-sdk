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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.PictureSearchPictureResponse;
import com.aliyuncs.linkvisual.model.v20180120.PictureSearchPictureResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.PictureSearchPictureResponse.Data.SearchData;
import com.aliyuncs.transform.UnmarshallerContext;


public class PictureSearchPictureResponseUnmarshaller {

	public static PictureSearchPictureResponse unmarshall(PictureSearchPictureResponse pictureSearchPictureResponse, UnmarshallerContext _ctx) {
		
		pictureSearchPictureResponse.setRequestId(_ctx.stringValue("PictureSearchPictureResponse.RequestId"));
		pictureSearchPictureResponse.setSuccess(_ctx.booleanValue("PictureSearchPictureResponse.Success"));
		pictureSearchPictureResponse.setCode(_ctx.stringValue("PictureSearchPictureResponse.Code"));
		pictureSearchPictureResponse.setErrorMessage(_ctx.stringValue("PictureSearchPictureResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("PictureSearchPictureResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("PictureSearchPictureResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("PictureSearchPictureResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("PictureSearchPictureResponse.Data.PageSize"));

		List<SearchData> pageData = new ArrayList<SearchData>();
		for (int i = 0; i < _ctx.lengthValue("PictureSearchPictureResponse.Data.PageData.Length"); i++) {
			SearchData searchData = new SearchData();
			searchData.setVectorId(_ctx.stringValue("PictureSearchPictureResponse.Data.PageData["+ i +"].VectorId"));
			searchData.setEventTime(_ctx.longValue("PictureSearchPictureResponse.Data.PageData["+ i +"].EventTime"));
			searchData.setThreshold(_ctx.floatValue("PictureSearchPictureResponse.Data.PageData["+ i +"].Threshold"));
			searchData.setPicUrl(_ctx.stringValue("PictureSearchPictureResponse.Data.PageData["+ i +"].PicUrl"));
			searchData.setIotId(_ctx.stringValue("PictureSearchPictureResponse.Data.PageData["+ i +"].IotId"));
			searchData.setGatewayIotId(_ctx.stringValue("PictureSearchPictureResponse.Data.PageData["+ i +"].GatewayIotId"));
			searchData.setVectorType(_ctx.integerValue("PictureSearchPictureResponse.Data.PageData["+ i +"].VectorType"));

			pageData.add(searchData);
		}
		data.setPageData(pageData);
		pictureSearchPictureResponse.setData(data);
	 
	 	return pictureSearchPictureResponse;
	}
}
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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListEventAlgorithmDetailsResponse;
import com.aliyuncs.vcs.model.v20200515.ListEventAlgorithmDetailsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventAlgorithmDetailsResponseUnmarshaller {

	public static ListEventAlgorithmDetailsResponse unmarshall(ListEventAlgorithmDetailsResponse listEventAlgorithmDetailsResponse, UnmarshallerContext _ctx) {
		
		listEventAlgorithmDetailsResponse.setRequestId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.RequestId"));
		listEventAlgorithmDetailsResponse.setCode(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Code"));
		listEventAlgorithmDetailsResponse.setMessage(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Message"));
		listEventAlgorithmDetailsResponse.setPageNumber(_ctx.integerValue("ListEventAlgorithmDetailsResponse.PageNumber"));
		listEventAlgorithmDetailsResponse.setPageSize(_ctx.integerValue("ListEventAlgorithmDetailsResponse.PageSize"));
		listEventAlgorithmDetailsResponse.setSuccess(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Success"));
		listEventAlgorithmDetailsResponse.setTotalCount(_ctx.integerValue("ListEventAlgorithmDetailsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListEventAlgorithmDetailsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].CorpId"));
			datas.setDataSourceId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].DataSourceId"));
			datas.setEventType(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].EventType"));
			datas.setEventValue(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].EventValue"));
			datas.setExtendValue(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].ExtendValue"));
			datas.setExtraExtendValue(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].ExtraExtendValue"));
			datas.setFaceCount(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].FaceCount"));
			datas.setLeftTopX(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].LeftTopX"));
			datas.setLeftTopY(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].LeftTopY"));
			datas.setPicUrlPath(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].PicUrlPath"));
			datas.setPointX(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].PointX"));
			datas.setPointY(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].PointY"));
			datas.setRecordId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].RecordId"));
			datas.setRightBottomX(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].RightBottomX"));
			datas.setRightBottomY(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].RightBottomY"));
			datas.setShotTime(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].ShotTime"));
			datas.setSourceId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].SourceId"));
			datas.setTargetPicUrlPath(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].TargetPicUrlPath"));

			data.add(datas);
		}
		listEventAlgorithmDetailsResponse.setData(data);
	 
	 	return listEventAlgorithmDetailsResponse;
	}
}
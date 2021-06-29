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
		listEventAlgorithmDetailsResponse.setTotalCount(_ctx.integerValue("ListEventAlgorithmDetailsResponse.TotalCount"));
		listEventAlgorithmDetailsResponse.setMessage(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Message"));
		listEventAlgorithmDetailsResponse.setPageSize(_ctx.integerValue("ListEventAlgorithmDetailsResponse.PageSize"));
		listEventAlgorithmDetailsResponse.setPageNumber(_ctx.integerValue("ListEventAlgorithmDetailsResponse.PageNumber"));
		listEventAlgorithmDetailsResponse.setCode(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Code"));
		listEventAlgorithmDetailsResponse.setSuccess(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Success"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListEventAlgorithmDetailsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setRightBottomY(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].RightBottomY"));
			datas.setDataSourceId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].DataSourceId"));
			datas.setPicUrlPath(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].PicUrlPath"));
			datas.setRecordId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].RecordId"));
			datas.setExtendValue(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].ExtendValue"));
			datas.setFaceCount(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].FaceCount"));
			datas.setRightBottomX(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].RightBottomX"));
			datas.setSourceId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].SourceId"));
			datas.setExtraExtendValue(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].ExtraExtendValue"));
			datas.setTargetPicUrlPath(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].TargetPicUrlPath"));
			datas.setEventType(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].EventType"));
			datas.setPointY(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].PointY"));
			datas.setLeftTopY(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].LeftTopY"));
			datas.setPointX(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].PointX"));
			datas.setCorpId(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].CorpId"));
			datas.setEventValue(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].EventValue"));
			datas.setShotTime(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].ShotTime"));
			datas.setLeftTopX(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].LeftTopX"));
			datas.setTagCode(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].TagCode"));
			datas.setTagCodeReliability(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].TagCodeReliability"));
			datas.setUuidCode(_ctx.stringValue("ListEventAlgorithmDetailsResponse.Data["+ i +"].UuidCode"));

			data.add(datas);
		}
		listEventAlgorithmDetailsResponse.setData(data);
	 
	 	return listEventAlgorithmDetailsResponse;
	}
}
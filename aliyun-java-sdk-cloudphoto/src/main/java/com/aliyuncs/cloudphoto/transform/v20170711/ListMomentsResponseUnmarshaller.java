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

package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.ListMomentsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListMomentsResponse.Moment;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMomentsResponseUnmarshaller {

	public static ListMomentsResponse unmarshall(ListMomentsResponse listMomentsResponse, UnmarshallerContext context) {
		
		listMomentsResponse.setRequestId(context.stringValue("ListMomentsResponse.RequestId"));
		listMomentsResponse.setCode(context.stringValue("ListMomentsResponse.Code"));
		listMomentsResponse.setMessage(context.stringValue("ListMomentsResponse.Message"));
		listMomentsResponse.setNextCursor(context.stringValue("ListMomentsResponse.NextCursor"));
		listMomentsResponse.setTotalCount(context.integerValue("ListMomentsResponse.TotalCount"));
		listMomentsResponse.setAction(context.stringValue("ListMomentsResponse.Action"));

		List<Moment> moments = new ArrayList<Moment>();
		for (int i = 0; i < context.lengthValue("ListMomentsResponse.Moments.Length"); i++) {
			Moment moment = new Moment();
			moment.setId(context.longValue("ListMomentsResponse.Moments["+ i +"].Id"));
			moment.setIdStr(context.stringValue("ListMomentsResponse.Moments["+ i +"].IdStr"));
			moment.setLocationName(context.stringValue("ListMomentsResponse.Moments["+ i +"].LocationName"));
			moment.setPhotosCount(context.integerValue("ListMomentsResponse.Moments["+ i +"].PhotosCount"));
			moment.setState(context.stringValue("ListMomentsResponse.Moments["+ i +"].State"));
			moment.setTakenAt(context.longValue("ListMomentsResponse.Moments["+ i +"].TakenAt"));
			moment.setCtime(context.longValue("ListMomentsResponse.Moments["+ i +"].Ctime"));
			moment.setMtime(context.longValue("ListMomentsResponse.Moments["+ i +"].Mtime"));

			moments.add(moment);
		}
		listMomentsResponse.setMoments(moments);
	 
	 	return listMomentsResponse;
	}
}
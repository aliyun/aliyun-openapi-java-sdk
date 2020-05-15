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

package com.aliyuncs.videoenhan.transform.v20200320;

import com.aliyuncs.videoenhan.model.v20200320.AbstractFilmVideoResponse;
import com.aliyuncs.videoenhan.model.v20200320.AbstractFilmVideoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AbstractFilmVideoResponseUnmarshaller {

	public static AbstractFilmVideoResponse unmarshall(AbstractFilmVideoResponse abstractFilmVideoResponse, UnmarshallerContext _ctx) {
		
		abstractFilmVideoResponse.setRequestId(_ctx.stringValue("AbstractFilmVideoResponse.RequestId"));

		Data data = new Data();
		data.setVideoUrl(_ctx.stringValue("AbstractFilmVideoResponse.Data.VideoUrl"));
		abstractFilmVideoResponse.setData(data);
	 
	 	return abstractFilmVideoResponse;
	}
}
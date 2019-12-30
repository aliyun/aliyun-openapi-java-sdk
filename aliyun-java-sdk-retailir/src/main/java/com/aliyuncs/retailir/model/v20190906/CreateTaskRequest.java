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

package com.aliyuncs.retailir.model.v20190906;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTaskRequest extends RpcAcsRequest<CreateTaskResponse> {
	   

	private String imageMiddleTop;

	private String imageRightTop;

	private String taskName;

	private List<ImageList> imageLists;

	private String imageLeftTop;

	private String imageMiddleBottom;

	private String imageLeftBottom;

	private String appkey;

	private String imageRightBottom;
	public CreateTaskRequest() {
		super("retailir", "2019-09-06", "CreateTask", "retailir");
		setMethod(MethodType.POST);
	}

	public String getImageMiddleTop() {
		return this.imageMiddleTop;
	}

	public void setImageMiddleTop(String imageMiddleTop) {
		this.imageMiddleTop = imageMiddleTop;
		if(imageMiddleTop != null){
			putQueryParameter("ImageMiddleTop", imageMiddleTop);
		}
	}

	public String getImageRightTop() {
		return this.imageRightTop;
	}

	public void setImageRightTop(String imageRightTop) {
		this.imageRightTop = imageRightTop;
		if(imageRightTop != null){
			putQueryParameter("ImageRightTop", imageRightTop);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public List<ImageList> getImageLists() {
		return this.imageLists;
	}

	public void setImageLists(List<ImageList> imageLists) {
		this.imageLists = imageLists;	
		if (imageLists != null) {
			for (int depth1 = 0; depth1 < imageLists.size(); depth1++) {
				putQueryParameter("ImageList." + (depth1 + 1) + ".Xaxis" , imageLists.get(depth1).getXaxis());
				putQueryParameter("ImageList." + (depth1 + 1) + ".FileLink" , imageLists.get(depth1).getFileLink());
				putQueryParameter("ImageList." + (depth1 + 1) + ".Yaxis" , imageLists.get(depth1).getYaxis());
			}
		}	
	}

	public String getImageLeftTop() {
		return this.imageLeftTop;
	}

	public void setImageLeftTop(String imageLeftTop) {
		this.imageLeftTop = imageLeftTop;
		if(imageLeftTop != null){
			putQueryParameter("ImageLeftTop", imageLeftTop);
		}
	}

	public String getImageMiddleBottom() {
		return this.imageMiddleBottom;
	}

	public void setImageMiddleBottom(String imageMiddleBottom) {
		this.imageMiddleBottom = imageMiddleBottom;
		if(imageMiddleBottom != null){
			putQueryParameter("ImageMiddleBottom", imageMiddleBottom);
		}
	}

	public String getImageLeftBottom() {
		return this.imageLeftBottom;
	}

	public void setImageLeftBottom(String imageLeftBottom) {
		this.imageLeftBottom = imageLeftBottom;
		if(imageLeftBottom != null){
			putQueryParameter("ImageLeftBottom", imageLeftBottom);
		}
	}

	public String getAppkey() {
		return this.appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
		if(appkey != null){
			putQueryParameter("Appkey", appkey);
		}
	}

	public String getImageRightBottom() {
		return this.imageRightBottom;
	}

	public void setImageRightBottom(String imageRightBottom) {
		this.imageRightBottom = imageRightBottom;
		if(imageRightBottom != null){
			putQueryParameter("ImageRightBottom", imageRightBottom);
		}
	}

	public static class ImageList {

		private Integer xaxis;

		private String fileLink;

		private Integer yaxis;

		public Integer getXaxis() {
			return this.xaxis;
		}

		public void setXaxis(Integer xaxis) {
			this.xaxis = xaxis;
		}

		public String getFileLink() {
			return this.fileLink;
		}

		public void setFileLink(String fileLink) {
			this.fileLink = fileLink;
		}

		public Integer getYaxis() {
			return this.yaxis;
		}

		public void setYaxis(Integer yaxis) {
			this.yaxis = yaxis;
		}
	}

	@Override
	public Class<CreateTaskResponse> getResponseClass() {
		return CreateTaskResponse.class;
	}

}

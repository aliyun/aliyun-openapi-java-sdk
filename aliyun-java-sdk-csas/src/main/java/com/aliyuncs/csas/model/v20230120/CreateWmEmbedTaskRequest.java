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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateWmEmbedTaskRequest extends RpcAcsRequest<CreateWmEmbedTaskResponse> {
	   

	private Boolean videoIsLong;

	private Long imageEmbedLevel;

	private String wmType;

	@SerializedName("documentControl")
	private DocumentControl documentControl;

	private Long imageEmbedJpegQuality;

	private String wmInfoUint;

	private String filename;

	private Long wmInfoSize;

	private String wmInfoBytesB64;

	private String fileUrl;

	private String videoBitrate;
	public CreateWmEmbedTaskRequest() {
		super("csas", "2023-01-20", "CreateWmEmbedTask");
		setMethod(MethodType.POST);
	}

	public Boolean getVideoIsLong() {
		return this.videoIsLong;
	}

	public void setVideoIsLong(Boolean videoIsLong) {
		this.videoIsLong = videoIsLong;
		if(videoIsLong != null){
			putBodyParameter("VideoIsLong", videoIsLong.toString());
		}
	}

	public Long getImageEmbedLevel() {
		return this.imageEmbedLevel;
	}

	public void setImageEmbedLevel(Long imageEmbedLevel) {
		this.imageEmbedLevel = imageEmbedLevel;
		if(imageEmbedLevel != null){
			putBodyParameter("ImageEmbedLevel", imageEmbedLevel.toString());
		}
	}

	public String getWmType() {
		return this.wmType;
	}

	public void setWmType(String wmType) {
		this.wmType = wmType;
		if(wmType != null){
			putBodyParameter("WmType", wmType);
		}
	}

	public DocumentControl getDocumentControl() {
		return this.documentControl;
	}

	public void setDocumentControl(DocumentControl documentControl) {
		this.documentControl = documentControl;	
		if (documentControl != null) {
			putBodyParameter("DocumentControl" , new Gson().toJson(documentControl));
		}	
	}

	public Long getImageEmbedJpegQuality() {
		return this.imageEmbedJpegQuality;
	}

	public void setImageEmbedJpegQuality(Long imageEmbedJpegQuality) {
		this.imageEmbedJpegQuality = imageEmbedJpegQuality;
		if(imageEmbedJpegQuality != null){
			putBodyParameter("ImageEmbedJpegQuality", imageEmbedJpegQuality.toString());
		}
	}

	public String getWmInfoUint() {
		return this.wmInfoUint;
	}

	public void setWmInfoUint(String wmInfoUint) {
		this.wmInfoUint = wmInfoUint;
		if(wmInfoUint != null){
			putBodyParameter("WmInfoUint", wmInfoUint);
		}
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
		if(filename != null){
			putBodyParameter("Filename", filename);
		}
	}

	public Long getWmInfoSize() {
		return this.wmInfoSize;
	}

	public void setWmInfoSize(Long wmInfoSize) {
		this.wmInfoSize = wmInfoSize;
		if(wmInfoSize != null){
			putBodyParameter("WmInfoSize", wmInfoSize.toString());
		}
	}

	public String getWmInfoBytesB64() {
		return this.wmInfoBytesB64;
	}

	public void setWmInfoBytesB64(String wmInfoBytesB64) {
		this.wmInfoBytesB64 = wmInfoBytesB64;
		if(wmInfoBytesB64 != null){
			putBodyParameter("WmInfoBytesB64", wmInfoBytesB64);
		}
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		if(fileUrl != null){
			putBodyParameter("FileUrl", fileUrl);
		}
	}

	public String getVideoBitrate() {
		return this.videoBitrate;
	}

	public void setVideoBitrate(String videoBitrate) {
		this.videoBitrate = videoBitrate;
		if(videoBitrate != null){
			putBodyParameter("VideoBitrate", videoBitrate);
		}
	}

	public static class DocumentControl {

		@SerializedName("InvisibleAntiAllCopy")
		private Boolean invisibleAntiAllCopy;

		@SerializedName("BackgroundControl")
		private BackgroundControl backgroundControl;

		@SerializedName("InvisibleAntiTextCopy")
		private Boolean invisibleAntiTextCopy;

		public Boolean getInvisibleAntiAllCopy() {
			return this.invisibleAntiAllCopy;
		}

		public void setInvisibleAntiAllCopy(Boolean invisibleAntiAllCopy) {
			this.invisibleAntiAllCopy = invisibleAntiAllCopy;
		}

		public BackgroundControl getBackgroundControl() {
			return this.backgroundControl;
		}

		public void setBackgroundControl(BackgroundControl backgroundControl) {
			this.backgroundControl = backgroundControl;
		}

		public Boolean getInvisibleAntiTextCopy() {
			return this.invisibleAntiTextCopy;
		}

		public void setInvisibleAntiTextCopy(Boolean invisibleAntiTextCopy) {
			this.invisibleAntiTextCopy = invisibleAntiTextCopy;
		}

		public static class BackgroundControl {

			@SerializedName("BgAddInvisible")
			private Boolean bgAddInvisible;

			@SerializedName("BgVisibleControl")
			private BgVisibleControl bgVisibleControl;

			@SerializedName("BgInvisibleControl")
			private BgInvisibleControl bgInvisibleControl;

			@SerializedName("BgAddVisible")
			private Boolean bgAddVisible;

			public Boolean getBgAddInvisible() {
				return this.bgAddInvisible;
			}

			public void setBgAddInvisible(Boolean bgAddInvisible) {
				this.bgAddInvisible = bgAddInvisible;
			}

			public BgVisibleControl getBgVisibleControl() {
				return this.bgVisibleControl;
			}

			public void setBgVisibleControl(BgVisibleControl bgVisibleControl) {
				this.bgVisibleControl = bgVisibleControl;
			}

			public BgInvisibleControl getBgInvisibleControl() {
				return this.bgInvisibleControl;
			}

			public void setBgInvisibleControl(BgInvisibleControl bgInvisibleControl) {
				this.bgInvisibleControl = bgInvisibleControl;
			}

			public Boolean getBgAddVisible() {
				return this.bgAddVisible;
			}

			public void setBgAddVisible(Boolean bgAddVisible) {
				this.bgAddVisible = bgAddVisible;
			}

			public static class BgVisibleControl {

				@SerializedName("Mode")
				private String mode;

				@SerializedName("PosX")
				private String posX;

				@SerializedName("PosY")
				private String posY;

				@SerializedName("VerticalNumber")
				private Long verticalNumber;

				@SerializedName("HorizontalNumber")
				private Long horizontalNumber;

				@SerializedName("VisibleText")
				private String visibleText;

				@SerializedName("FontSize")
				private Long fontSize;

				@SerializedName("FontColor")
				private String fontColor;

				@SerializedName("Angle")
				private Long angle;

				@SerializedName("HorizonNumber")
				private Long horizonNumber;

				@SerializedName("Opacity")
				private Long opacity;

				@SerializedName("FontTransparent")
				private String fontTransparent;

				public String getMode() {
					return this.mode;
				}

				public void setMode(String mode) {
					this.mode = mode;
				}

				public String getPosX() {
					return this.posX;
				}

				public void setPosX(String posX) {
					this.posX = posX;
				}

				public String getPosY() {
					return this.posY;
				}

				public void setPosY(String posY) {
					this.posY = posY;
				}

				public Long getVerticalNumber() {
					return this.verticalNumber;
				}

				public void setVerticalNumber(Long verticalNumber) {
					this.verticalNumber = verticalNumber;
				}

				public Long getHorizontalNumber() {
					return this.horizontalNumber;
				}

				public void setHorizontalNumber(Long horizontalNumber) {
					this.horizontalNumber = horizontalNumber;
				}

				public String getVisibleText() {
					return this.visibleText;
				}

				public void setVisibleText(String visibleText) {
					this.visibleText = visibleText;
				}

				public Long getFontSize() {
					return this.fontSize;
				}

				public void setFontSize(Long fontSize) {
					this.fontSize = fontSize;
				}

				public String getFontColor() {
					return this.fontColor;
				}

				public void setFontColor(String fontColor) {
					this.fontColor = fontColor;
				}

				public Long getAngle() {
					return this.angle;
				}

				public void setAngle(Long angle) {
					this.angle = angle;
				}

				public Long getHorizonNumber() {
					return this.horizonNumber;
				}

				public void setHorizonNumber(Long horizonNumber) {
					this.horizonNumber = horizonNumber;
				}

				public Long getOpacity() {
					return this.opacity;
				}

				public void setOpacity(Long opacity) {
					this.opacity = opacity;
				}

				public String getFontTransparent() {
					return this.fontTransparent;
				}

				public void setFontTransparent(String fontTransparent) {
					this.fontTransparent = fontTransparent;
				}
			}

			public static class BgInvisibleControl {

				@SerializedName("InvisibleTransparent")
				private String invisibleTransparent;

				@SerializedName("Opacity")
				private Long opacity;

				public String getInvisibleTransparent() {
					return this.invisibleTransparent;
				}

				public void setInvisibleTransparent(String invisibleTransparent) {
					this.invisibleTransparent = invisibleTransparent;
				}

				public Long getOpacity() {
					return this.opacity;
				}

				public void setOpacity(Long opacity) {
					this.opacity = opacity;
				}
			}
		}
	}

	@Override
	public Class<CreateWmEmbedTaskResponse> getResponseClass() {
		return CreateWmEmbedTaskResponse.class;
	}

}
